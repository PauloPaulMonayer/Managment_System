package services;

import model.BaseCustomer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<BaseCustomer> customersList;

    public CustomerService() {
        this.customersList = new ArrayList<>();
    }

    public void addCustomer(BaseCustomer c) {
        customersList.add(c);
    }

    public BaseCustomer getCustomerById(String id) {
        for (BaseCustomer c : customersList) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public boolean updateCustomer(BaseCustomer updatedCustomer) {
        for (int i = 0; i < customersList.size(); i++) {
            if (customersList.get(i).getId().equals(updatedCustomer.getId())) {
                customersList.set(i, updatedCustomer);
                return true;
            }
        }
        return false;
    }

    public boolean removeCustomer(String id) {
        return customersList.removeIf(c -> c.getId().equals(id));
    }

    public List<BaseCustomer> listAllCustomers() {
        // Return a copy
        return new ArrayList<>(customersList);
    }
}