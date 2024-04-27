package lesson18.classwork1904.homework;

public class Student {
     String name;
     int age;
     String studentNote;
     public Student(){
     }
     public Student(String studentName) {name = studentName;}

     public Student(String studentName, String studentNote){
        name = studentName;
        this.studentNote = studentNote;
     }

     public Student(String studentName, String studentNote, int age) {
         this(studentName, studentNote);
         this.age = age;
     }

    public void introduce() {System.out.println("Hello");
    }
    void study() { System.out.println("is studying hard."); }

    public void whoAmI() {System.out.println( "Hi, my name is " + name + " and I am " + age + " years old." +
            "\n" + "Student Note: " + studentNote);}

}
