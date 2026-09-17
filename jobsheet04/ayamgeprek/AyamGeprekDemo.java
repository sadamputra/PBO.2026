package jobsheet04.ayamgeprek;

import java.time.LocalDate;

public class AyamGeprekDemo {
    public static void main(String[] args) {

        Produk ayamGeprek = new Produk(
                "P001",
                "Ayam Geprek",
                15000
        );

        Produk esTeh = new Produk(
                "P002",
                "Es Teh",
                5000
        );

        Pelanggan pelanggan = new Pelanggan(
                "C001",
                "Sadam"
        );

        Pesanan pesanan = new Pesanan(
                "ORD001",
                LocalDate.of(2026, 9, 17),
                pelanggan
        );

        DetailPesanan detail1 = new DetailPesanan(
                ayamGeprek,
                2
        );

        DetailPesanan detail2 = new DetailPesanan(
                esTeh,
                1
        );

        pesanan.tambahDetail(detail1);
        pesanan.tambahDetail(detail2);

        System.out.println(pesanan.getInfo());
    }
}