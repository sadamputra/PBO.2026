package jobsheet04.ayamgeprek;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pesanan {
    private String nomorPesanan;
    private LocalDate tanggal;
    private Pelanggan pelanggan;
    private ArrayList<DetailPesanan> detailPesanan;

    public Pesanan(String nomorPesanan, LocalDate tanggal, Pelanggan pelanggan) {
        this.nomorPesanan = nomorPesanan;
        this.tanggal = tanggal;
        this.pelanggan = pelanggan;
        this.detailPesanan = new ArrayList<>();
    }

    public void setNomorPesanan(String nomorPesanan) {
        this.nomorPesanan = nomorPesanan;
    }

    public String getNomorPesanan() {
        return nomorPesanan;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void tambahDetail(DetailPesanan detail) {
        detailPesanan.add(detail);
    }

    public double getTotal() {
        double total = 0;

        for (DetailPesanan detail : detailPesanan) {
            total += detail.getSubtotal();
        }

        return total;
    }

    public String getInfo() {
        String info = "Nomor Pesanan: " + nomorPesanan
                + ", Tanggal: " + tanggal
                + ", Pelanggan: " + pelanggan.getNama();

        info += "\nDetail Pesanan:";

        for (DetailPesanan detail : detailPesanan) {
            info += "\n- " + detail.getInfo();
        }

        info += "\nTotal: " + getTotal();

        return info;
    }
}