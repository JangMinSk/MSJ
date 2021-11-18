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
class Won2Dollar extends Converter{
	@Override
	protected double convert(double src) {
		
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		
		return "��";
	}

	@Override
	protected String getDestString() {
		
		return "�޷�";
	}


	public Won2Dollar(int i) {
		this.ratio=i;
	}

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();

	}
}	