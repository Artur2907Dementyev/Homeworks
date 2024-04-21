package lesson18.classwork1904.homework;

public class Student {
     String name;
     int age;
     String studentId;
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    public String introduce() {
        return "Hi, my name is " + name + " and I am " + age + " years old.";
    }
    public String study() {
        return name + " is studying hard.";
    }
}
