package ie.lyit.serialize;

import java.io.*;

import java.util.ArrayList;
import java.util.*;
import ie.lyit.hotel.Customer;

public class CustomerSerializer{ 
	//constant filename to be created
	final String FILENAME = "Customer.txt";
	
	//Next available unique Customer number
	//Declare ArrayList
	private ArrayList<Customer> customers ;

	// Default Constructor
		public CustomerSerializer (){
			// Construct the customer list ArrayList
			 customers = new ArrayList<Customer>();
				//readRecordsFromFile();
			}	
		
		// method to add/create a customer
		public void add(){
			// Create a customer object
			Customer customer = new Customer();
			// Read its details
			Customer.read();	
			// And add it to the customer ArrayList
			customers.add(customer);
		}

		// method to list a customer
			public void list(){
				// for every customer thats an object in customers
		        for(Customer tempCustomer:customers)
					// display it
					System.out.println(tempCustomer);
			}
			
			public Customer view(){
				Scanner keyboard = new Scanner(System.in);		

				// Read the number of the Customer to be viewed from the user
				System.out.println("ENTER NUMBER OF CUSTOMER : ");
				int customerToView=keyboard.nextInt();
				
			    for(Customer tempCustomer:customers){
				   // if it's number equals the number of the customerToView
//				   if(tempCustomer.getCustomerNo() == customerToView){
//				      // display it
//					  System.out.println(tempCustomer);
//					  return tempCustomer;
//				   }
				}
			    // if we reach this then the customer was not found so return null
			    return null;		
			}
			
		// method to delete a customer
			public void delete(){	
				// Call view() to find, display, & return the Customer to delete
				Customer tempCustomer= view();
				// If the Customer != null, i.e. it was found then...
			    if(tempCustomer != null)
				   // ...remove it 
			       customers.remove(tempCustomer);
			}
			
			public void edit(){	
				// Call view() to find, display, & return the Customer to edit
				Customer tempCustomer = view();
				// If the Customer != null, i.e. it was found then...
			    if(tempCustomer != null){
				   // get it's index
				   int index=customers.indexOf(tempCustomer);
				   // read in a new Customer and...
				   tempCustomer.read();
				   // reset the object in currents
				   customers.set(index, tempCustomer);
			    }
			}
			
			public void writeRecordsToFile(){
				try{
					//File file = new File(FILENAME);
					// Serialize the ArrayList...
					//if(file.canWrite()) {
					FileOutputStream fileStream = new FileOutputStream(FILENAME);
			
					ObjectOutputStream os = new ObjectOutputStream(fileStream);
			
					os.writeObject(customers);
			
					os.close();
					//}
				}
				catch(FileNotFoundException fNFE){
					System.out.println("Cannot create file to store customers.");
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
			
			public void readRecordsFromFile(){
				//ObjectInputStream is=null;
				try{
					// Deserialize the ArrayList...
					//File file = new File(FILENAME);
					//if(file.canRead()) {
					FileInputStream fis = new FileInputStream(FILENAME);
					
					ObjectInputStream is = new ObjectInputStream(fis);
					customers = (ArrayList<Customer>)is.readObject();
					is.close();
					//nextUniqueNumber = currents.size() + 1;
					   //for(Customer tmpCustomer:customers){
						   // if it's number equals the number of the bookToView
//						   if(tmpCustomer.getCustomerNo() > nextUniqueNumber){
//							   nextUniqueNumber = tmpCustomer.getCustomerNo(); 
//						   }
						//}
					 
					
					//}
				}
				catch(FileNotFoundException fNFE){
					System.out.println("Cannot find customers file.");
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}				
			}	

	}

