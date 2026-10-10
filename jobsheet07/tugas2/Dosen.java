package jobsheet07.tugas2;

public class Dosen extends Manusia {
    // Overriding method makan
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantor kampus sambil istirahat mengajar.");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur menyiapkan materi kuliah.");
    }
}