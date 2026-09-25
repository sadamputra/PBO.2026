package QUIZ1.PROSES_PESANAN;

public class Stock {
    private int shopNo;
    private int quantity;
    private Product product; // Relasi Aggregation ke Product

    public Stock(int shopNo, int quantity, Product product) {
        this.shopNo = shopNo;
        this.quantity = quantity;
        this.product = product;
    }

    public int getShopNo() { return shopNo; }
    public void setShopNo(int shopNo) { this.shopNo = shopNo; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public void addStock() {
        System.out.println("Method addStock() dijalankan.");
    }
    public void modifyStock(int productId) {
        System.out.println("Method modifyStock() untuk Product ID " + productId + " dijalankan.");
    }
    public void selectStockItem(int productId) {
        System.out.println("Method selectStockItem() untuk Product ID " + productId + " dijalankan.");
    }
}