package ie.lyit.hotel;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
import ie.lyit.hotel.Customer;

public class Customer extends Person implements Serializable{// INHERITANCE - Customer IS-A Person
	// Customer has name, address, & phoneNumber from Person
	protected static String emailAddress;    // AND emailAddress
	protected int number;			    // AND number
	//private int customerNo;

	private static int nextNumber=1;// static for unique number - starts off at 1
	
	// Default Constructor
	// Called when object is created like this ==> 
	//   Customer cObj = new Customer();	
	public Customer(){ 
		super();
		emailAddress=null;
		number=nextNumber++;
		//super();
		// NOTE:Don't need to call super() explicitly.
		//emailAddress=null;
		// Set number to static nextNumber before incrementing nextNumber
		//number=nextNumber++;
	}
	// Initialization Constructor
	// Called when object is created like this ==>
	// Customer cObj = new Customer("Mr","Joe","Doe","12 Hi Rd,Letterkenny",
	//                              "0871234567","joe@hotmail.com");
	public Customer(String t, String fN, String sn, String address, 
			        String pNo, String email){
		// Call super class constructor - Passing parameters required by Person ONLY!
		super(t, fN, sn, address, pNo);
		// And then initialise Customers own instance variables
		emailAddress=email;
		// And finally set number to static nextNumber before incrementing nextNumber
		number=nextNumber++;
	}

	// OVERRIDING the Person toString() method!
	// Calling Persons toString() method, and adding additional bits
	@Override
	public String toString(){
		//return super.toString() + ", " + this.getEmailAddress() + " \nUser Number: " + this.getNumber();
		return (super.toString() + " EMAIL: " + this.getEmailAddress() + "AccountNo: " + this.getNumber());
	}

	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(c1.equals(c2))				
	// ==> Probably sufficient to compare customer numbers as they're unique
	@Override
	public boolean equals(Object obj){
		Customer cObject;
		if (obj instanceof Customer)
		   cObject = (Customer)obj;
		else
		   return false;
		   
	    return(this.number==cObject.number);
	}

	// set() and get() methods
	public void setEmailAddress(String emailAddress){
		this.emailAddress=emailAddress;
	}
	public String getEmailAddress(){
		return this.emailAddress;
	}	
	// You shouldn't be able to setNumber() as it is unique, 
	// so don't provide a setNumber() method
	public int getNumber(){
		return number;
	}

	public static Customer read(){
//	    Scanner kbString = new Scanner(System.in);
//	   
//	   System.out.println("ENTER CUSTOMER DETAILS:");
//	   System.out.println("ENTER NAME");
//	   Name n = null;
//	   //Checks if only letters were entered.
//	   while (n == null){
//		   try {
//			   System.out.print("TITLE : ");
//			   String title=kbString.nextLine();
//			   System.out.print("FIRSTNAME : ");
//			   String fn=kbString.nextLine();
//			   System.out.print("SURNAME : ");
//			   String sn =kbString.nextLine();
//			   //looks if the name matches a specific patter without numbers
//			   
//			   
//			   if (title.matches("^[\\p{L} .'-]+$") && fn.matches("^[\\p{L} .'-]+$") && sn.matches("^[\\p{L} .'-]+$")){
//			   n = new Name(title,fn,sn);
//			   }else {
//				System.out.println("Enter a valid name!");
//			   }
//		   //throws exception if the argument are no letters
//		   } catch (IllegalArgumentException e) {
//			   System.out.println("Enter a valid name!");
//		   }
//	   }
//	   name = n;
//	   System.out.print("ADDRESS : ");
//	   address=kbString.nextLine();
//
//	   System.out.println("EMAIL: ");
//	   String em = kbString.nextLine();
//	   
//	   System.out.print("PHONENUMBER : ");
//	   String phoneNumber = kbString.nextLine();
//	   
	   Name newN = new Name();
	   Scanner keyIn = new Scanner(System.in);
	   //Person newP = new Person();
	   Customer newCus = new Customer();
	   System.out.println("TITLE:");
	   newN.setTitle(keyIn.nextLine());
	   System.out.println("NAME:");
	   newN.setFirstName(keyIn.nextLine());
	   System.out.println("SURNAME:");
	   newN.setSurname(keyIn.nextLine());
	   newCus.setName(newN);
	   System.out.print("ADDRESS: ");
	   newCus.setAddress(keyIn.nextLine());
	   System.out.print("NUMBER: ");
	   newCus.setPhoneNumber(keyIn.nextLine());
	   
	   System.out.print("EMAIL: ");
	   newCus.setEmailAddress(keyIn.nextLine());
	   
	   
	   System.out.println(newCus.toString());
	   return newCus;
	   
	   
	}
//	public int getCustomerNo() {
//		return customerNo;
//	}

		
}
