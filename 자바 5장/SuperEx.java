package work5;

class Point{
	private int x,y; //Ŭ�������� ����x,y
	public Point() {//������
		this.x=this.y=0;//x,y this =0
	}
	public Point(int x, int y) { //int xy ���� ��� ����
		this.x=x; this.y = y; //�Ű����� this x,y ���� ��´�
	}
	public void showPoint() {// ���
		System.out.println("("+x+","+y+")");
	}
}
class Colorpoint extends Point{// �θ� ��� Ŭ����
	private String color;// ���� ���� Ŭ������ ����
	public Colorpoint(int x, int y, String color) {// �÷�����Ʈ �Ű����� 3��
		super(x,y); // �θ��� �Ű����� xy���� ������Ű�� ���� ���� <<���۾Ⱦ��� ���������� �Ȱ��� ��������.
		this.color=color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();//�θ� ����Ʈ������ ��.
	}
}
public class SuperEx {

	public static void main(String[] args) {
		Colorpoint cp=new Colorpoint(5,6,"blue"); //�Ű����� �ִ� ������.
		cp.showColorPoint();
		
	}

}
