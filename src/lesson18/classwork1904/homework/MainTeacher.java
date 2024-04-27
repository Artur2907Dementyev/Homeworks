package lesson18.classwork1904.homework;

public class MainTeacher {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        teacher.morning();
        teacher.speaks();
        teacher.task();

        System.out.println("\n ========================= \n");

        Teacher teacher1 = new Teacher("Kupfervogel", 37, "History" );
        teacher1.whoAmI();

        System.out.println("\n ========================= \n");

        Teacher teacher2 = new Teacher("Petrow", 29, "Sport" );
        teacher2.whoAmI();

        System.out.println("\n ========================= \n");

        Teacher teacher3 = new Teacher("Brown", 43, "Physic" );
        teacher3.whoAmI();
    }
}
