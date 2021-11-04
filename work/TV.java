package work;

public class TV {
	String LG;
	int year;
	int inch;
	
	void show() {
		System.out.println(LG+"에서 만든"+year+"년형"+inch+"인치"+"TV");
	}
	
	public TV(String LG,int year, int inch) {
		this.LG=LG;
		this.year=year;
		this.inch=inch;
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}

}
