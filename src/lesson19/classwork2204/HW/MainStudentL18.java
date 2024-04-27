package lesson19.classwork2204.HW;

public class MainStudentL18 {
    public static void main(String[] args) {
        StudentLesson18 lars = new StudentLesson18("Lars", "good", 18);
        StudentLesson18 igor = new StudentLesson18("Igor", "bad",17);
        StudentLesson18 john = new StudentLesson18("John", "average",16);

        StudentLesson18.meet(lars, igor, john);

        StudentLesson18.noteResolution(lars);
        StudentLesson18.noteResolution(igor);
        StudentLesson18.noteResolution(john);
    }
}