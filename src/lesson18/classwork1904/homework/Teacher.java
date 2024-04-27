package lesson18.classwork1904.homework;

public class Teacher {
    String name;
    int age;
    String subject;

    public Teacher() {

    }

    public Teacher(String teacherName) {name = teacherName;}

    public Teacher(String teacherName, String subject){
        name = teacherName;
        this.subject = subject;
    }

    public Teacher(String teacherName, int age, String subject) {
        this(teacherName, subject);
        this.age = age;

    }
    public void morning(){System.out.println("good morning Students");
    }
    void speaks(){System.out.println("what question we have");}
    void task(){System.out.println("Here is your homework");}

    public void whoAmI() {
        System.out.println("His age is "+ age +" and his name is " + name + " is teaching " + subject + ".");}
}
