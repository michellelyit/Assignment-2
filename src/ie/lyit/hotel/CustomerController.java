// Michelle Lawn, L00114121, CSDF
package ie.lyit.hotel;

import View.CustomerView;

public class CustomerController {
	private Customer model;
	private CustomerView view;
	
	public CustomerController(Customer model, CustomerView view){
		this.model = model;
		this.view = view;
	}
	
	public void setCustomerName(Name name){
		model.setName(name);
	}

	public Name getCustomertName(){
		return model.getName();
	}
	
	public void updateView(){
		view.printCustomerDetails(model.getName(), model.getNumber());
	}
}