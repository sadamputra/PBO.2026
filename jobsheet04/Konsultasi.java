package jobsheet04;

import java.time.LocalDate;

public class Konsultasi {
    private LocalDate tanggal;
    private Pegawai dokter;
    private Pegawai perawat;

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setDokter(Pegawai dokter) {
        this.dokter = dokter;
    }

    public Pegawai getDokter() {
        return dokter;
    }

    public void setPerawat(Pegawai perawat) {
        this.perawat = perawat;
    }

    public Pegawai getPerawat() {
        return perawat;
    }

    public String getInfo() {
        return "Tanggal: " + tanggal
                + ", Dokter: " + dokter.getInfo()
                + ", Perawat: " + perawat.getInfo();
    }
}