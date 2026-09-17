package jobsheet04.ayamgeprek;

public class DetailPesanan {
    private Produk produk;
    private int jumlah;

    public DetailPesanan(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public Produk getProduk() {
        return produk;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getSubtotal() {
        return produk.getHarga() * jumlah;
    }

    public String getInfo() {
        return "Produk: " + produk.getNamaProduk()
                + ", Jumlah: " + jumlah
                + ", Subtotal: " + getSubtotal();
    }
}