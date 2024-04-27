package lesson18.classwork1904.homework;

import lesson18.classwork1904.MainCat;

public class MainDoctor {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();

        doctor.introduce();
        doctor.diagnose();
        doctor.beCareful();

        System.out.println("\n ========================= \n");

        Doctor doctor1 = new Doctor("Dr. Vogelhaus", 40, "Ophthalmology");
        doctor1.whoAmI();

        System.out.println("\n ========================= \n");

        Doctor doctor2 = new Doctor("Dr.Komarow ", 38, "Surgeon");
        doctor2.whoAmI();

        System.out.println("\n ========================= \n");

        Doctor doctor3 = new Doctor("Dr. Livesey", 36, "Family doctor");
        doctor3.whoAmI();
    }
}
