package over;

import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;//����
	
	public void run() {
		Scanner scn=new Scanner(System.in);
		System.out.println(getSrcString() + "��"+getDestString()+"�� �ٲߴϴ�");
		System.out.println(getSrcString()+"�� �Է��ϼ���>>");
		double val = scn.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���:"+res+getDestString()+"�Դϴ�");
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
		Km2Mile toMile = new Km2Mile(1.6);//1���� 1.6km
		toMile.run();

	}

}
