package lesson18.classwork1904.homework;

public class Doctor {
    String name;
    int age;
    String specialization;

    public Doctor(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    public String introduce() {
        return "Greetings! I am Dr. " + name + ".";
    }

    public String diagnose() {
        return name + " specializes in " + specialization + " and is diagnosing patients.";
    }
}
