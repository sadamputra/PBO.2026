package UTS.Soal01;

public class Professor extends Person {
    private double salary;

    @Override
    public void displayInfo() {
        System.out.println("Professor: " + name);
    }
}