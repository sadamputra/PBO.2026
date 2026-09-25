package QUIZ1.BENGKEL_MAJU;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Membuat object Pelanggan
        Pelanggan pelanggan = new Pelanggan("Sadam Putra", "081234567890");

        // 2. Membuat object Karyawan (Mekanik)
        Karyawan mekanik = new Karyawan("MEK-01", "Budi Santoso");

        // 3. Membuat object Kendaraan (2 Mobil, 2 Sepeda Motor)
        Kendaraan mobil1 = new Kendaraan("N 1111 AA", "Toyota", "Avanza", "Mobil", pelanggan);
        Kendaraan mobil2 = new Kendaraan("N 2222 BB", "Honda", "Civic", "Mobil", pelanggan);
        Kendaraan motor1 = new Kendaraan("AG 3333 CC", "Yamaha", "NMAX", "Sepeda Motor", pelanggan);
        Kendaraan motor2 = new Kendaraan("AG 4444 DD", "Honda", "Vario", "Sepeda Motor", pelanggan);

        // Menambahkan kendaraan ke daftar milik pelanggan
        pelanggan.tambahKendaraan(mobil1);
        pelanggan.tambahKendaraan(mobil2);
        pelanggan.tambahKendaraan(motor1);
        pelanggan.tambahKendaraan(motor2);

        // 4. Membuat object Layanan (Setiap kendaraan diservis)
        ArrayList<Layanan> daftarServis = new ArrayList<>();
        daftarServis.add(new Layanan("Ganti Oli Mobil", 150000, mobil1, mekanik));
        daftarServis.add(new Layanan("Tune Up Mobil", 200000, mobil2, mekanik));
        daftarServis.add(new Layanan("Servis CVT Motor", 75000, motor1, mekanik));
        daftarServis.add(new Layanan("Ganti Kampas Rem", 50000, motor2, mekanik));

        // 5. Menampilkan Output
        System.out.println("======================================");
        System.out.println("    SISTEM INFORMASI BENGKEL MAJU     ");
        System.out.println("======================================");
        
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("No. Telepon    : " + pelanggan.getNomorTelepon());
        System.out.println("--------------------------------------");
        
        System.out.println("DAFTAR KENDARAAN MILIK PELANGGAN:");
        for (Kendaraan k : pelanggan.getDaftarKendaraan()) {
            System.out.println("- [" + k.getTipeKendaraan() + "] " + k.getMerek() + " " + k.getModel() + " (" + k.getPlatNomor() + ")");
        }
        System.out.println("--------------------------------------");

        System.out.println("RINCIAN LAYANAN & PERKIRAAN BIAYA:");
        double totalSemuaBiaya = 0;
        
        for (Layanan l : daftarServis) {
            System.out.println("Kendaraan   : " + l.getKendaraan().getMerek() + " " + l.getKendaraan().getModel() + " (" + l.getKendaraan().getTipeKendaraan() + ")");
            System.out.println("Layanan     : " + l.getServiceName());
            System.out.println("Mekanik     : " + l.getMekanik().getNamaKaryawan());
            System.out.println("Biaya Dasar : Rp" + l.getServicePrice());
            System.out.println("Total Biaya : Rp" + l.hitungTotalBiaya());
            System.out.println();
            
            // Menambahkan total biaya layanan ini ke total keseluruhan
            totalSemuaBiaya += l.hitungTotalBiaya();
        }
        
        System.out.println("======================================");
        System.out.println("TOTAL ESTIMASI BIAYA KESELURUHAN : Rp" + totalSemuaBiaya);
        System.out.println("======================================");
    }
}