package Vo;

public class Nation {
	private String country;
	private String capital;
	
	public Nation(String cot,String cap){
		this.country=cot;
		this.capital=cap;
	}
	public String getCountry() {
		return country;
	}
	public String getCapital() {
		return capital;
	}
	@Override
	public String toString() {
		return country + "," + capital ;
	}
}