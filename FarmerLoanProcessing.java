public class FarmerLoanProcessing {

	public static void main(String[] args) {
		int survey = 121;
		Farmer f1 = new Farmer("Suresh","Verma","II A 15",survey++,"Ram Nagar","Sihani","Ghaziabad","UP","123456789087");
		f1.getLoan("Crop Loan");		
		f1.getLoan("Tractor Loan");
		f1.displayFarmer();
		f1.pay(1,"Crop Loan");
		f1.pay(2,"Tractor Loan");
		
		int ar[] = f1.getEmiArray();
		for(int i=0;i<3;i++) {
			if(ar[i] == -12) {
				
			}else {
				if(i==0) System.out.println("Crop Loan");
				else if(i == 1) System.out.println("Water Pipe Loan");
				else System.out.println("Trator Loan");
				System.out.println("Emi's Left :"+ar[i]);
				System.out.println();
			}
		}
		
		Farmer f2 = new Farmer("Mahesh","Garg","I A 12",survey++,"Nehru Nagar","Tihar","Uttra Khand","UK","143457789087");
		f2.getLoan("Crop Loan");
		f2.getLoan("Tractor Loan");
		f2.getLoan("Water Pipe Loan");
		f2.displayFarmer();
		
		f2.pay(3,"Water Pipe Loan");
		f2.pay(2,"Crop Loan");
		
		
		
		int ar1[] = f2.getEmiArray();
		for(int i=0;i<3;i++) {
			if(ar1[i] == -12) {
				
			}else {
				if(i==0) System.out.println("Crop Loan");
				else if(i == 1) System.out.println("Water Pipe Loan");
				else System.out.println("Trator Loan");
				System.out.println("Emi's Left :"+ar1[i]);
			}
		}

	}

}
