package UTS.Soal01;

public class Student extends Person {
    private String studentNumber;
    private double averageMark;

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name);
    }

    public boolean isEligibleToEnroll() {
        return averageMark >= 60;
    }

    public int getSeminarsTaken() {
        return 0;
    }
}