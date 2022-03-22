package code;
import java.util.*;

public class Loan {
	static int l_num=0;
	int l_amt, l_tenure, emiAmt, numOfEmi;
	int c = 0;
	boolean emiPaid[];
	Loan(){
		
	}
	Loan(int l_amt,int l_t,int amt,int num){
		l_num++;
		this.l_amt = l_amt;
		l_tenure = l_t;
		emiAmt = amt;
		numOfEmi = num;
		emiPaid = new boolean[num];		
	}
	public int getLoanNumber() {
		return l_num;
	}
	
	public int getLoanAmount() {
		return l_amt;
	}
	
	public int getLoanTenure() {
		return l_tenure;
	}
	
	public int getEmiAmount() {
		return emiAmt;
	}
	
	public int getNumberOfEmi() {
		return numOfEmi;
	}
	public void displayLoan() {
		System.out.println("Loan Number :- "+l_num);
		System.out.println("Loan Amount :- "+l_amt);
		System.out.println("Loan Tenure :- "+l_tenure);
		System.out.println("EMI Amount:- "+emiAmt);
		System.out.println("Number of Emi :- "+numOfEmi);
	}
	public void payEmi(int emiAmount) {
		emiPaid[c++] = true;
		numOfEmi--;
		l_amt -= emiAmt;		
	}
}
class CropLoan extends Loan{
	String CropName;
	int estYield;
	float ROI = 6.5f;
	CropLoan(String n,int y){
		CropName = n;
		estYield = y;
		
	}	
	public void displayCropLoan() {
		System.out.println("Crop Name:- "+CropName);
		System.out.println("Estimated Yield:- "+estYield);
		System.out.println("Rate Of Interest:- "+ROI);
	}
}
class WaterPipeLineLoan extends Loan{
	int length;
	String source;
	float ROI = 5;
	WaterPipeLineLoan(int l, String s){
		length = l;
		source = s;
	}
	public void displayWaterPipeLineLoan() {
		System.out.println("Length Of Pipe:- "+length);
		System.out.println("Source Of Water:- "+source);
		System.out.println("Rate Of Interest:- "+ROI);
	}
}
class TractorLoan extends Loan{
	String name;
	String model;
	float ROI = 7f;
	TractorLoan(String n, String m){
		name = n;
		model = m;
	}
	public void displayTractorLoan() {
		System.out.println("Name Of Company:- "+name);
		System.out.println("Tractor Model:- "+model);
		System.out.println("Rate Of Interest:- "+ROI);
	}
}
