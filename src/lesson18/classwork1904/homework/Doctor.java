package lesson18.classwork1904.homework;

public class Doctor {
    String name;
    int age;
    String specialization;

    public Doctor() {

    }

    public Doctor(String doctorName) {name = doctorName;}

    public Doctor(String doctorName, String specialization) {
        name = doctorName;
        this.specialization = specialization;
    }

    public Doctor(String doctorName, int age, String specialization) {
        this(doctorName, specialization);
        this.age = age;
    }

    void introduce() {
        System.out.println("Greetings! I am Dr.");}

    void diagnose() {
        System.out.println("where does it hurt?");
    }
    public void beCareful() {
        System.out.println("be careful next time");
    }
    public void whoAmI() {
        System.out.println("Hello my name is " + name + "my age is " + age + " specializes in " + specialization + " and is diagnosing patients.");}
}
