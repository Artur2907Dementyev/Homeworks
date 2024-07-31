package lesson44.Hw44;

import java.time.LocalDate;

public class ProgrammingLanguage {
    String name;
    String author;
    LocalDate firstReleaseDate;

    public ProgrammingLanguage(String name, String author, LocalDate firstReleaseDate) {
        this.name = name;
        this.author = author;
        this.firstReleaseDate = firstReleaseDate;
    }

    @Override
    public String toString() {
        return name + " by " + author + ", first released on " + firstReleaseDate;
    }
}

