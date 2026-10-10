package jobsheet07.tugas2;

public class ManusiaDemo {
    public static void main(String[] args) {
        System.out.println("=== Demonstrasi Dynamic Method Dispatch ===");

        // Dynamic Method Dispatch: Referensi Manusia menunjuk objek Dosen
        Manusia m1 = new Dosen();
        m1.bernafas();
        m1.makan(); // Memanggil method makan() versi Dosen (Overriding)
        // m1.lembur(); // Error jika langsung dipanggil karena tipe referensi adalah Manusia

        System.out.println("-------------------------------------------");

        // Dynamic Method Dispatch: Referensi Manusia menunjuk objek Mahasiswa
        Manusia m2 = new Mahasiswa();
        m2.bernafas();
        m2.makan(); // Memanggil method makan() versi Mahasiswa (Overriding)
        // m2.tidur(); // Error jika langsung dipanggil karena tipe referensi adalah Manusia
    }
}