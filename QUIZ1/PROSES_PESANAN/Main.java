package QUIZ1.PROSES_PESANAN;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat object Customer
        Customer pelanggan = new Customer(1, "Budi Santoso", "Jl. Malang Raya", "08123456789");
        
        // Membuat object Product
        Product produk1 = new Product(101, 150000.0f, "Elektronik");
        
        // Membuat object Order yang berelasi dengan Customer
        Order pesanan = new Order(1001, 1.5f, new Date(), pelanggan);
        
        // Membuat object Stock yang berelasi dengan Product
        Stock stokToko = new Stock(5, 50, produk1);

        // Menampilkan hasil pemanggilan method untuk membuktikan program jalan
        System.out.println("--- TESTING PROGRAM PEMROSESAN PESANAN ---");
        System.out.println("Nama Pelanggan: " + pesanan.getCustomer().getCustomerName());
        System.out.println("Nama Produk di Stok: " + stokToko.getProduct().getProductType());
        
        System.out.println("\n--- TESTING METHOD ---");
        pelanggan.addCustomer();
        produk1.selectProduct(101);
        pesanan.createOrder();
        stokToko.addStock();
    }
}