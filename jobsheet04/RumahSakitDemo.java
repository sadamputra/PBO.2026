package jobsheet04;

import java.time.LocalDate;

public class RumahSakitDemo {
    public static void main(String[] args) {

        Pegawai dokter = new Pegawai("D001", "Dr. Budi");
        Pegawai perawat = new Pegawai("P001", "Siti");

        Pasien pasien = new Pasien("RM001", "Andi");

        Konsultasi konsultasi1 = new Konsultasi();
        konsultasi1.setTanggal(LocalDate.of(2026, 9, 17));
        konsultasi1.setDokter(dokter);
        konsultasi1.setPerawat(perawat);

        pasien.tambahKonsultasi(konsultasi1);

        System.out.println(pasien.getInfo());
    }
}