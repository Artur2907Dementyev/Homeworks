package consultation_10.enums;

import java.util.Arrays;

public class EnumExample {
    public static void main(String[] args) {

        User user = new User("test@mail.com", "gwwer");

        System.out.println(user.info());

        Day today = Day.THURSDAY;

        switch (today) {
            case MONDAY:
                System.out.println("today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
        }

        Day[] days = Day.values();

        System.out.println(Arrays.toString(days));

        for (int i = 0; i < days.length; i++) {
            if (days[i] == today) {

            }
        }
    }
}
