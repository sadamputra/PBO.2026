package QUIZ1.BENGKEL_MAJU;

import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String nomorTelepon;
    private ArrayList<Kendaraan> daftarKendaraan; // Menyimpan banyak kendaraan

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.daftarKendaraan = new ArrayList<>();
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNomorTelepon() { return nomorTelepon; }
    public void setNomorTelepon(String nomorTelepon) { this.nomorTelepon = nomorTelepon; }

    public ArrayList<Kendaraan> getDaftarKendaraan() { return daftarKendaraan; }

    // Method tambahan untuk memasukkan kendaraan ke list pelanggan
    public void tambahKendaraan(Kendaraan k) {
        daftarKendaraan.add(k);
    }
}