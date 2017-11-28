//Michelle Lawn, L00114121, CSDF
package ie.lyit.hotel;
import java.util.*;

import ie.lyit.hotel.Customer;

public class CustomerDaoImpl implements CustomerDAO {
	
	List<Customer>customers;
	
	public List<Customer> getCustomer(){
		return null;
	}
	
	public CustomerDaoImpl(){
		customers = new ArrayList<Customer>();
		Customer customer1 = new Customer("Mr","Jake","Smith","12 Main Street,Donegal",
											"0871234567","jakeS@gmail.com");
		customers.add(customer1);
	}
	
	public Customer getCustomer(int number){
		return customers.get(number);
	}

	public void updateCustomer(Customer customer){
		customers.get(customer.getNumber()).setName(customer.getName());
		System.out.println("Customer Number: "+ customer.getNumber() + " updated");
	}
	
	public void deleteCustomer(Customer customer){
		customers.remove(customer.getNumber());
		System.out.println("Customer Number: " + customer.getAddress()+ "deleted from database");
	}
}
