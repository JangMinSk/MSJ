package work;

import java.util.Scanner;

public class Circle {
	private double x,y;
	private int radius;
		public Circle(double x, double y, int radius) {
			this. x=x;
			this. y=y;
			this.radius=radius;
		}
		int getradius() {
			return this.radius;
		}
		
		void show() {
			
			System.out.println("x"+","+"y"+"radius");//��� Circle ��ü ���
			System.out.println(x+","+y+","+radius);
		}
		
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Circle c[]= new Circle[3];
		System.out.println("x,y,������ �� 3�� �Է� �� ��");
		for(int i=0;i<c.length;i++) {
			double x=scn.nextDouble();//x�� �б�
			double y=scn.nextDouble();//y�� �б�
			int radius=scn.nextInt();//������ �ϱ�
			c[i]=new Circle(x,y,radius);//Circle ��ü ����
		}
		int z=0;//�񱳸� ���� �ʱ�ȭ ���� 
		for(int i=0;i<c.length;i++) {
			
			if (c[i].getradius()>z) {
				z=c[i].getradius();
			}
		}
		for(int i=0;i<c.length;i++) {
			if (c[i].getradius()==z)
				c[i].show();			
		}			
	}
	
}
