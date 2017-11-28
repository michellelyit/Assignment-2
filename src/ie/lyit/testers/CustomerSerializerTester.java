package ie.lyit.testers;

import ie.lyit.serialize.Menu;
import ie.lyit.serialize.CustomerSerializer;

public class CustomerSerializerTester {
	public static void main(String[] args){
		
		// Create an object of CustomerSerializer
		CustomerSerializer CustomerSerializer = new CustomerSerializer();
		
		 // Create a Menu Object
		Menu menuObj = new Menu();
		
		do{
			// Call it's display() method
			menuObj.display();
			// Call it's readOption() method
			menuObj.readOption();
			// switch on the option and call the appropriate method
			switch(menuObj.getOption()){
				  case 1:CustomerSerializer.add();break;
				  case 2:CustomerSerializer.list();break;
				  case 3:CustomerSerializer.view();break;
				  case 4:CustomerSerializer.edit();break;
				  case 5:CustomerSerializer.delete();break;
				  case 6:CustomerSerializer.writeRecordsToFile();break;				
				  default:System.out.println("INVALID OPTION...");
			}
		}while(menuObj.getOption() != 6);	
																				
		// Serialize the ArrayList to the File	
		CustomerSerializer.writeRecordsToFile();
	}
}
