package lesson44.Hw44;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProgrammingLanguage> languages = new ArrayList<>();
        languages.add(new ProgrammingLanguage("Java", "James Gosling", LocalDate.of(1995, 5, 23)));
        languages.add(new ProgrammingLanguage("Python", "Guido van Rossum", LocalDate.of(1991, 2, 20)));
        languages.add(new ProgrammingLanguage("C", "Dennis Ritchie", LocalDate.of(1972, 1, 1)));
        ProgrammingLanguage oldestLanguage = languages.stream()
                .min(Comparator.comparing(lang -> lang.firstReleaseDate))
                .orElse(null);
        System.out.println("Oldest language: " + oldestLanguage);

        List<Parcel> parcels = new ArrayList<>();
        parcels.add(new Parcel("New York", "Berlin", 5.0, LocalDateTime.of(2024, 7, 20, 10, 0)));
        parcels.add(new Parcel("Tokyo", "Berlin", 2.5, LocalDateTime.of(2024, 7, 21, 15, 30)));
        parcels.add(new Parcel("Paris", "London", 3.0, LocalDateTime.of(2024, 7, 22, 9, 45)));
        Parcel newestParcelToBerlin = parcels.stream()
                .filter(parcel -> parcel.destinationCity.equals("Berlin"))
                .max(Comparator.comparing(parcel -> parcel.creationDateTime))
                .orElse(null);
        System.out.println("Newest parcel to Berlin: " + newestParcelToBerlin);

        List<Meeting> meetings = new ArrayList<>();
        meetings.add(new Meeting("Alice", "Bob", LocalDateTime.of(2024, 7, 22, 10, 0)));
        meetings.add(new Meeting("Charlie", "Dave", LocalDateTime.of(2024, 7, 22, 14, 30)));
        meetings.add(new Meeting("Eve", "Frank", LocalDateTime.of(2024, 7, 22, 9, 45)));
        Duration totalDuration = Duration.ZERO;
        for (Meeting meeting : meetings) {
            totalDuration = totalDuration.plus(Duration.between(LocalDateTime.of(2024, 7, 22, 0, 0), meeting.meetingDateTime));
        }
        LocalDateTime averageMeetingTime = LocalDateTime.of(2024, 7, 22, 0, 0).plusSeconds(totalDuration.getSeconds() / meetings.size());
        System.out.println("Average meeting time: " + averageMeetingTime.toLocalTime());
    }
}

