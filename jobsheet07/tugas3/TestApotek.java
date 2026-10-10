package jobsheet07.tugas3;

public class TestApotek {
    public static void main(String[] args) {
        System.out.println("=== SISTEM MANAJEMEN PEGAWAI APOTEK ===");
        
        // Membuat objek dari Superclass PegawaiApotek
        PegawaiApotek pegawai1 = new PegawaiApotek("P001", "Budi Santoso", 3500000);
        System.out.println("\n-- Informasi Pegawai Umum --");
        System.out.println("ID Pegawai : " + pegawai1.idPegawai);
        System.out.println("Nama       : " + pegawai1.nama);
        System.out.println("Gaji Pokok : " + pegawai1.gajiPokok);
        pegawai1.tugasUtama();
        
        // Demonstrasi Overloading pada PegawaiApotek
        pegawai1.updateKontak("081234567890");
        pegawai1.updateKontak("081234567890", "budi@apotek.com");

        System.out.println("\n-------------------------------------------");

        // Membuat objek dari Subclass Apoteker
        Apoteker apoteker1 = new Apoteker("A001", "Siti Aminah, S.Farm., Apt.", 6000000, "SIPA/2026/001");
        System.out.println("\n-- Informasi Apoteker (Inheritance & Overriding) --");
        apoteker1.infoApoteker();
        
        // Demonstrasi Overloading juga dapat diakses oleh Subclass karena diwarisi
        apoteker1.updateKontak("089876543210", "siti.aminah@apotek.com");
    }
}