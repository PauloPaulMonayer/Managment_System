package model;

public abstract class BaseCustomer {
    private String fullName;
    private String id;
    private String phone;

    public BaseCustomer(String fullName, String id, String phone) {
        this.fullName = fullName;
        this.id = id;
        this.phone = phone;
    }

    // getters/setters
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Abstract methods for discount logic
    public abstract double calculateDiscount(double price);

    public abstract String getType();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}