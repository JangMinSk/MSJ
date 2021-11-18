package over;
import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;//비율
	
	public void run() {
		Scanner scn=new Scanner(System.in);
		System.out.println(getSrcString() + "을"+getDestString()+"로 바꿉니다");
		System.out.println(getSrcString()+"을 입력하세요>>");
		double val = scn.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과:"+res+getDestString()+"입니다");
	}
}
class Won2Dollar extends Converter{
	@Override
	protected double convert(double src) {
		
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		
		return "원";
	}

	@Override
	protected String getDestString() {
		
		return "달러";
	}


	public Won2Dollar(int i) {
		this.ratio=i;
	}

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();

	}
}	