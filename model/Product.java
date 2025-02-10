package model;

public class Product {
    private String productId;
    private String name;
    private String category;
    private double price;
    private int quantityInStock;

    /**
     * This 'branch' field indicates which branch carries this product.
     * For centralized management, we store all products in one list,
     * but filter by 'branch' when needed.
     */
    private String branch;

    public Product(String productId, String name, String category,
                   double price, int quantityInStock, String branch) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.branch = branch;
    }

    // Constructor overloading.

    public Product(String productId, String name, String category,
                   double price, int quantityInStock) {
        this(productId, name, category, price, quantityInStock, "DEFAULT_BRANCH");
    }

    // Getters/Setters

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                ", branch='" + branch + '\'' +
                '}';
    }
}