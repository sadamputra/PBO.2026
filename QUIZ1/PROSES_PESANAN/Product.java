package QUIZ1.PROSES_PESANAN;

public class Product {
    private int productId;
    private float productPrice;
    private String productType;

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public float getProductPrice() { return productPrice; }
    public void setProductPrice(float productPrice) { this.productPrice = productPrice; }

    public String getProductType() { return productType; }
    public void setProductType(String productType) { this.productType = productType; }

    public void addProduct() {
        System.out.println("Method addProduct() dijalankan.");
    }
    public void modifyProduct() {
        System.out.println("Method modifyProduct() dijalankan.");
    }
    public void selectProduct(int productId) {
        System.out.println("Method selectProduct() untuk ID " + productId + " dijalankan.");
    }
}