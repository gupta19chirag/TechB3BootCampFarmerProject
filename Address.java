
public class Address {
	String houseNo;
	int surveyNo;
	String locality,taluka, district, state;	
	Address(String h, int sur, String l,String t,String d,String s){
		houseNo = h;
		surveyNo = sur;
		locality = l;
		taluka = t;
		district = d;
		state = s;
	}
	public void setHouseNo(String h) {
		houseNo = h;
	}
	public void setSurveyNo(int s) {
		surveyNo = s;
	}
	public void setLocality(String l) {
		locality = l;		
	}
	public void setTaluka(String t) {
		taluka = t;		
	}
	public void setDistrict(String d) {
		district = d;
	}
	public void setState(String s) {
		state = s;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public int getSurveyNo() {
		return surveyNo;
	}
	public String getLocality() {
		return locality;
	}
	public String getTaluka() {
		return taluka;
	}
	public String getDistrict() {
		return district;
	}
	public String getState() {
		return state;
	}
	public void displayAddress() {
		System.out.println("House Number :- "+houseNo);
		System.out.println("Survey Number :- "+surveyNo);
		System.out.println("Locality :- "+locality);
		System.out.println("Taluka :- "+taluka);
		System.out.println("District :- "+district);
		System.out.println("State :- "+state);
		
	}
}
