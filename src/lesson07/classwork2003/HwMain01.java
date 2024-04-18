package lesson07.classwork2003;

import java.util.Scanner;

public class HwMain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your month on numbers");

        int n = scanner.nextInt();
        String Seasons = "";
        switch (n) {
            case 1:
                Seasons = "January";
                break;
            case 2:
                Seasons = "February";
                break;
            case 3:
                Seasons = "March";
                break;
            case 4:
                Seasons = "April";
                break;
            case 5:
                Seasons = "May";
                break;
            case 6:
                Seasons = "June";
                break;
            case 7:
                Seasons = "July";
                break;
            case 8:
                Seasons = "August";
                break;
            case 9:
                Seasons = "September";
                break;
            case 10:
                Seasons = "October";
                break;
            case 11:
                Seasons = "November";
                break;
            case 12:
                Seasons = "December";
                break;
        }
        System.out.println(Seasons);

    }
}
