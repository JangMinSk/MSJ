package work;

public class TV {
	String LG;
	int year;
	int inch;
	
	void show() {
		System.out.println(LG+"���� ����"+year+"����"+inch+"��ġ"+"TV");
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
