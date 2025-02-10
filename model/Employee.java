package model;

public class Employee {
    private String fullName;
    private String id;
    private String phone;
    private String bankAccount;
    
    /**
     * This 'branch' field represent a branch ID or name.
     * (e.g., "B001" or "Tel Aviv")
     */
    private String branch;
    private int employeeNumber;

    public enum Role {
        SHIFT_MANAGER,
        CASHIER,
        SELLER,
        ADMIN
    }

    private Role role;

    // authentication
    private String username;
    private String password;

    public Employee(String fullName, String id, String phone,
                    String bankAccount, String branch,
                    int employeeNumber, Role role) {
        this.fullName = fullName;
        this.id = id;
        this.phone = phone;
        this.bankAccount = bankAccount;
        this.branch = branch;
        this.employeeNumber = employeeNumber;
        this.role = role;
    }

    // Getters/Setters

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

    public String getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    // Authentication fields
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", branch='" + branch + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", role=" + role +
                '}';
    }
}