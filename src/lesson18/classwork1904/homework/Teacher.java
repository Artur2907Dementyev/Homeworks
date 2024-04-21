package lesson18.classwork1904.homework;

public class Teacher {
    String name;
    int age;
    String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String introduce() {
        return "Hello, I am " + name + ", a teacher.";
    }

    public String teach() {
        return name + " is teaching " + subject + ".";
    }
}
