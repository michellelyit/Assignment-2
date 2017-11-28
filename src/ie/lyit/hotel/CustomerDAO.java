//Michelle Lawn, L00114121, CSDF
package ie.lyit.hotel;

import java.util.List;

public interface CustomerDAO {

public List<Customer> getCustomer();
public Customer getCustomer(int number);
public void updateCustomer(Customer customers);
public void deleteCustomer(Customer customers);
}