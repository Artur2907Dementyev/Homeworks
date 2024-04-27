package lesson19.classwork2204.HW;

public class StudentLesson18 {

    public static final String SPECIES = "Classmate";

    private String name;
    private int age;
    private String studentNote;

    public StudentLesson18(String studentName) {name = studentName;}

    public StudentLesson18(String studentName, String studentNote, int age) {
        this.name = studentName;
        this.age = age;
        this.studentNote = studentNote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + ", and im " + age + " old!" + "\n");
    }

    public static void noteResolution(StudentLesson18 studentLesson18) {
        System.out.println(studentLesson18.name + ": My exam Resolutes is " + studentLesson18.studentNote);
    }

    public static void meet(StudentLesson18 s1, StudentLesson18 s2, StudentLesson18 s3) {
        System.out.println(s1.name + " and " + s2.name + " with " + s3.name + " meeting together" + "\n");
        s1.sayHello();
        s2.sayHello();
        s3.sayHello();
    }



}
