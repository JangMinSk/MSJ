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
			
			System.out.println("x"+","+"y"+"radius");//모든 Circle 객체 출력
			System.out.println(x+","+y+","+radius);
		}
		
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Circle c[]= new Circle[3];
		System.out.println("x,y,반지름 값 3번 입력 후 비교");
		for(int i=0;i<c.length;i++) {
			double x=scn.nextDouble();//x값 읽기
			double y=scn.nextDouble();//y값 읽기
			int radius=scn.nextInt();//반지름 일기
			c[i]=new Circle(x,y,radius);//Circle 객체 생성
		}
		int z=0;//비교를 위한 초기화 정수 
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
