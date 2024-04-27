package lesson18.classwork1904.homework;

public class MainStudent {
    public static void main(String[] args) {

        Student student = new Student();

        student.introduce();
        student.study();

        System.out.println("\n ========================= \n");

        Student student1 = new Student("Lars", "-bad-", 18);
        student1.whoAmI();

        System.out.println("\n ========================= \n");

        Student student2 = new Student("Igor", "-good-", 17);
        student2.whoAmI();

        System.out.println("\n ========================= \n");

        Student student3 = new Student("john", "-average-", 16);
        student3.whoAmI();

    }
}
