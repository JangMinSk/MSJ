package Vo;

public class cuntry {
	private String country;
	private String capital;
	
		public cuntry(String cn,String ci){
			this.country=cn;			
			this.capital=ci;
		}
	public String getCountry() {
		return country;
	}
	public String getCapital() {
		return capital;
	}
	@Override
	public String toString() {
		return country + "," + capital;
	}
}