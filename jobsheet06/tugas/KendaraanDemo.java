package jobsheet06.tugas;

public class KendaraanDemo {
    public static void main(String[] args) {
        // 5. Instansiasi objek child class (Motor dan Truk)
        Motor motor1 = new Motor("Honda", "Merah Hitam", 2023, "Stang Jepit");
        Truk truk1 = new Truk("Hino", "Hijau", 2021, 10);

        System.out.println("=== DATA AWAL MOTOR ===");
        System.out.println(motor1.getInfoMotor());

        System.out.println("=== DATA AWAL TRUK ===");
        System.out.println(truk1.getInfoTruk());

        // 6. Modifikasi nilai atribut (atribut warisan & atribut child)
        motor1.warna = "Hitam Doff";      // Atribut warisan dari Kendaraan
        motor1.jenisStang = "Stang Standar"; // Atribut milik Motor

        truk1.tahunKeluaran = 2022;          // Atribut warisan dari Kendaraan
        truk1.kapasitasMuatan = 15;          // Atribut milik Truk

        System.out.println("=== DATA SETELAH DIMODIFIKASI (MOTOR) ===");
        System.out.println(motor1.getInfoMotor());

        System.out.println("=== DATA SETELAH DIMODIFIKASI (TRUK) ===");
        System.out.println(truk1.getInfoTruk());
    }
}