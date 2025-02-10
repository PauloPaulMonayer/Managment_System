package model;

public class Branch {
    private String branchId;
    private String name;

    public Branch(String branchId, String name) {
        this.branchId = branchId;
        this.name = name;
    }

    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId='" + branchId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}