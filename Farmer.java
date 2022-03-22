import java.util.*;

public class Farmer {
	String f_name;
	String l_name;
	String adhar;	
	int emiCount[] = {-12,-12,-12};
	Loan obj1;
	PermanatAddress.Address obj;
	Farmer(String f,String l,String a,int b,String c,String d,String e,String g,String adhar){
		f_name = f;
		l_name = l;		
		this.adhar = adhar;
		obj  = new PermanatAddress.Address(a,b,c,d,e,g);
		obj1 = new Loan();
	}		
	
	boolean loantaken[] = new boolean[3];
	public void displayFarmer() {
		System.out.println("First Name :"+f_name);
		System.out.println("Last Name :"+l_name);
		System.out.println("Adhar Number :"+adhar);
		System.out.println("Address :-");
		obj.displayAddress();
		System.out.println("Loan Taken:-");
		if(loantaken[0]!=false) {
			System.out.println("Crop Loan");
		}
		if(loantaken[1]!=false) {
			System.out.println("Water Pipe Line Loan");
		}
		if(loantaken[2]!=false) {
			System.out.println("Tractor Loan");
		}			
	}
	public void getLoan(String s) {		
		if(s.equals("Crop Loan")) {			
			CropLoan obj = new CropLoan("Wheat",1200);		
			loantaken[0] = true;
			emiCount[0] = 12;
		}else if(s.equals("Water Pipe Loan")) {
			WaterPipeLineLoan obj = new WaterPipeLineLoan(25,"Tube well");
			loantaken[1] = true;
			emiCount[1] = 12;
		}else {
			TractorLoan obj = new TractorLoan("Mahindra","2022");
			loantaken[2] = true;
			emiCount[2] = 12;
		}
	}
	public void pay(int count,String nameOfCrope) {
		if(nameOfCrope.equals("Crop Loan")) {						
			emiCount[0] -= count;
		}else if(nameOfCrope.equals("Water Pipe Loan")) {			
			emiCount[1] -= count;
		}else {			
			emiCount[2] -= count;
		}		
	}
	public int[] getEmiArray() {
		return emiCount;
	}
	static class FieldAddress{
		
	}
	
}
