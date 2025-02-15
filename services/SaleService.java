package services;

import model.BaseCustomer;
import model.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SaleService {

    private ProductService productService;

    // We keep a static list of all sales
    private static List<SaleRecord> allSales = new ArrayList<>();

    public SaleService(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Purchases a product for the given customer.
     * 
     * @param customer  the customer making the purchase
     * @param productId the ID of the product
     * @param quantity  the quantity to purchase
     * @return the final price after discounts, or -1 if an error occurred
     */
    public double purchaseProduct(BaseCustomer customer, String productId, int quantity) {
        // 1) Find the product
        Product product = productService.getProductById(productId);
        if (product == null) {
            System.out.println("Product not found!");
            return -1;
        }

        // 2) Check stock
        if (product.getQuantityInStock() < quantity) {
            System.out.println("Not enough stock for product " + productId);
            return -1;
        }

        // 3) Calculate total price before discount
        double totalPrice = product.getPrice() * quantity;

        // 4) Apply discount based on customer type (polymorphism)
        double finalPrice = customer.calculateDiscount(totalPrice);

        // 5) Deduct stock
        product.setQuantityInStock(product.getQuantityInStock() - quantity);

        // 6) Record the sale in our static list
        SaleRecord record = new SaleRecord(
                product.getProductId(),
                product.getName(),
                product.getCategory(),
                product.getBranch(),
                quantity,
                finalPrice,
                LocalDateTime.now()
        );
        allSales.add(record);

        // 7) Return final price
        return finalPrice;
    }

    /**
     * Returns all recorded sales.
     */
    public static List<SaleRecord> getAllSales() {
        return allSales;
    }

    public static class SaleRecord {
        private String productId;
        private String productName;
        private String productType;
        private String branch;
        private int quantity;
        private double finalPrice;
        private LocalDateTime saleTime;

        public SaleRecord(String productId, String productName, String productType, String branch,
                          int quantity, double finalPrice, LocalDateTime saleTime) {
            this.productId = productId;
            this.productName = productName;
            this.productType = productType;
            this.branch = branch;
            this.quantity = quantity;
            this.finalPrice = finalPrice;
            this.saleTime = saleTime;
        }

        public String getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public String getProductType() {
            return productType;
        }

        public String getBranch() {
            return branch;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getFinalPrice() {
            return finalPrice;
        }

        public LocalDateTime getSaleTime() {
            return saleTime;
        }
    }
}