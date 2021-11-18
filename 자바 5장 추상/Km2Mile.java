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
class Km2Mile extends Converter{
	public Km2Mile(double d) {
		this.ratio=d;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	@Override
	protected String getSrcString() {
		return "km";
	}
	@Override
	protected String getDestString() {
		return "mile";
	}
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);//1마일 1.6km
		toMile.run();

	}

}
