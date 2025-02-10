package model;

public class VipCustomer extends BaseCustomer {

    public VipCustomer(String fullName, String id, String phone) {
        super(fullName, id, phone);
    }

    @Override
    public double calculateDiscount(double price) {
        // For VIP customers, 20% discount.
        return price * 0.80;
    }

    public String getType() {
        return "VIP";
    }
}
