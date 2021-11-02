package workspce;

class Studant {
	private String name="홍길동";
	private int ban=1;
	private int no=1;
	private int kor=100;
	private int eng=60;
	private int math=76;
	
	

	
public Studant(String name, String ban, String no, String kor, String eng, String math) {
	// TODO Auto-generated constructor stub
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getBan() {
	return ban;
}

public void setBan(int ban) {
	this.ban = ban;
}


public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
}


	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
	
	public class MoM2 {
		
		public static void main(String[] args) {
		Studant info=new Studant("이름","1","1","100","60","76");
		double k= info.getKor();
		double k1= info.getEng();
		double k2= info.getMath();
		double c=(k+k1+k2)/3;
	
		System.out.println("이름:"+info.getName()+" "+"반:"+info.getBan()+" "+"번호:"+info.getNo());
		System.out.println("합계:"+(info.getKor()+info.getEng()+info.getMath()));
		System.out.println("평균"+(String.format("%.1f",c)));
}}