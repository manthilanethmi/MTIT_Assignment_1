package billproducer;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import billItem.BillItem;

public class ProducerBill implements BillProducer{
	Scanner input = new Scanner(System.in);
	BillItem bill  = new BillItem();
	String Fpath = System.getProperty("user.home");

	public String wellcome() {
		// TODO Auto-generated method stub
		return "_________________________________ Bill DashBoard _________________________________\\n";
	}

	public void insertnewbill(String foodItem, String foodName, String Quantity) {
		// TODO Auto-generated method stub
		bill.setFoodItem(foodItem);
		bill.setFoodName(foodName);
		bill.setQuantity(Quantity);
		this.AddRecord();


	}
	@SuppressWarnings("unused")
	private void AddRecord() {
		// TODO Auto-generated method stub
		boolean found = false;

		try {  
			File myObj = new File(Fpath+"\\bill.txt");  
			if (myObj.createNewFile()) {  
				System.out.println("File created: " + myObj.getName());  
				System.out.println("File Opened: " + myObj.getAbsolutePath()); 
			} else {
				System.out.println("File Opened: " + myObj.getAbsolutePath()); 
			} 
			try { 
				String nameNumberString;
				int index;
				String foodItem;
				String foodName;
				String Quantity;
				String newfoodItem= bill.getFoodItem();     
				String newfoodName = bill.getFoodName();
				String newDriscription = bill.getQuantity();



				RandomAccessFile raf= new RandomAccessFile(myObj, "rw");


				if (found == false) {


					nameNumberString= newfoodItem + "!"+ newfoodName+"!"+newDriscription;


					raf.writeBytes(nameNumberString);

					raf.writeBytes(System.lineSeparator());

					System.out.println("New Bill added Successfull !!! ");
					System.out.println("Hi " + newfoodItem+", well be added to the bill ");

					raf.close();
				}


			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}  




		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();  
		}  

	}



	public void ViewAllRecord()  {
		
		      try {
		    	File myObj = new File(Fpath+"\\oder.txt");
				if (myObj.createNewFile()) {  
						System.out.println("File created: " + myObj.getName());  
						System.out.println("File Opened: " + myObj.getAbsolutePath()); 
					} else {
						System.out.println("File Opened: " + myObj.getAbsolutePath()); 
					}
				  Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println("......................................Avilabal Foods in shop....................................\n");
			        System.out.println(data);
			      }
			      myReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		    

    }
	public String display() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertnewBill(String foodItem, String foodName, String Quantity) {
		// TODO Auto-generated method stub
		
	}

}
