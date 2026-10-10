package jobsheet07.tugas2;

public class Mahasiswa extends Manusia {
    // Overriding method makan
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di warung dekat kos.");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah mengerjakan tugas PBO.");
    }
}
