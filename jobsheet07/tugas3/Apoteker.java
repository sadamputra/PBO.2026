package jobsheet07.tugas3;

public class Apoteker extends PegawaiApotek {
    public String nomorSIPA;

    public Apoteker(String idPegawai, String nama, double gajiPokok, String nomorSIPA) {
        super(idPegawai, nama, gajiPokok);
        this.nomorSIPA = nomorSIPA;
    }

    // Overriding method tugasUtama khusus untuk Apoteker
    @Override
    public void tugasUtama() {
        System.out.println("Apoteker " + nama + " (SIPA: " + nomorSIPA + ") bertugas melayani resep dokter, meracik obat, dan konsultasi obat.");
    }

    public void infoApoteker() {
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Nama       : " + nama);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("No. SIPA   : " + nomorSIPA);
        tugasUtama();
    }
}