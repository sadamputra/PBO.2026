package jobsheet04;

import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi;

    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<>();
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tambahKonsultasi(Konsultasi konsultasi) {
        riwayatKonsultasi.add(konsultasi);
    }

    public String getInfo() {
        String info = "No Rekam Medis: " + noRekamMedis
                + ", Nama: " + nama;

        if (!riwayatKonsultasi.isEmpty()) {
            info += "\nRiwayat Konsultasi:";

            for (Konsultasi konsultasi : riwayatKonsultasi) {
                info += "\n- " + konsultasi.getInfo();
            }
        }

        return info;
    }
}