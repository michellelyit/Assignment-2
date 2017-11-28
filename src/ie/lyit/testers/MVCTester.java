// Michelle Lawn, L00114121, CSDF
package ie.lyit.testers;

import ie.lyit.hotel.Customer;
import ie.lyit.hotel.CustomerController;
import ie.lyit.hotel.Name;
import View.CustomerView;

public class MVCTester {
	private static Name name1;

	public static void main(String[] args) {
		Customer model = retreiveCustomerFromDatabase();
		
		CustomerView view = new CustomerView();
		
		CustomerController controller = new CustomerController(model, view);
		
		controller.updateView();

	}

	private static Customer retreiveCustomerFromDatabase() {
		Customer customer = new Customer();
		name1.setTitle("Ms");
		name1.setFirstName("Jess");
		name1.setSurname("Casey");
		Name n2 = name1;
		customer.setName(n2);
		return customer;
	}

}
