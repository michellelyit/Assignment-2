//Michelle Lawn, L00114121, CSDF
package ie.lyit.testers;

import ie.lyit.hotel.Customer;
import ie.lyit.hotel.Name;
import ie.lyit.hotel.CustomerDAO;
import ie.lyit.hotel.CustomerDaoImpl;

public class DaoTester {
	private static Name n1;

	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDaoImpl();
		
		for (Customer customer : customerDAO.getCustomer()){
			System.out.println("Customer Account : [Number: "+ customer.getNumber() + ", Name "+ customer.getName()+ "]");
		}
		Customer customer = customerDAO.getCustomer().get(0);
		n1.setTitle("Mr");
		n1.setFirstName("Pauric");
		n1.setSurname("Lawn");
		Name n2 = n1;
		customer.setName(n2);
		customerDAO.updateCustomer(customer);
		
		customerDAO.getCustomer(0);
		System.out.println("Customer : [Number: "+customer.getNumber() + ", Name "+ customer.getName()+ "]");
	}

}
