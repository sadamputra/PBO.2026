package jobsheet04.ayamgeprek;

public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;

    public Produk(String kodeProduk, String namaProduk, double harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getInfo() {
        return "Kode Produk: " + kodeProduk
                + ", Nama Produk: " + namaProduk
                + ", Harga: " + harga;
    }
}