package UTS.Soal01;

public class Person {
    protected String name;
    protected String phoneNumber;
    protected String emailAddress;

    public void purchaseParkingPass() {
        System.out.println("Parking pass purchased");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }

    // Overloading
    public void displayInfo(String name) {
        System.out.println("Name: " + name);
    }
}