package model;

public class NewCustomer extends BaseCustomer {

    public NewCustomer(String fullName, String id, String phone) {
        super(fullName, id, phone);
    }

    @Override
    public double calculateDiscount(double price) {
        // For a brand new customer, we offer 5% discount.
        return price * 0.95; // 5% discount
    }

    public String getType() {
        return "NEW";
    }
}
