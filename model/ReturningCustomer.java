package model;

public class ReturningCustomer extends BaseCustomer {

    public ReturningCustomer(String fullName, String id, String phone) {
        super(fullName, id, phone);
    }

    @Override
    public double calculateDiscount(double price) {
        // For returning customers, a 10% discount
        return price * 0.90;
    }

    public String getType() {
        return "RETURNING";
    }
}
