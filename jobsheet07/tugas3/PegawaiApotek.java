package jobsheet07.tugas3;

public class PegawaiApotek {
    // Menggunakan kata kunci final pada atribut idPegawai sesuai rancangan
    public final String idPegawai;
    public String nama;
    public double gajiPokok;

    // Constructor untuk menginisialisasi idPegawai yang bersifat final
    public PegawaiApotek(String idPegawai, String nama, double gajiPokok) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Overloading 1: Memperbarui kontak dengan 1 parameter (nomor HP saja)
    public void updateKontak(String nomorHp) {
        System.out.println("Kontak pegawai " + nama + " diperbarui dengan No. HP: " + nomorHp);
    }

    // Overloading 2: Memperbarui kontak dengan 2 parameter (nomor HP dan email)
    public void updateKontak(String nomorHp, String email) {
        System.out.println("Kontak pegawai " + nama + " diperbarui dengan No. HP: " + nomorHp + " dan Email: " + email);
    }

    // Method utama yang nantinya akan di-override
    public void tugasUtama() {
        System.out.println(nama + " bertugas melayani transaksi kasir dan penataan obat.");
    }
}