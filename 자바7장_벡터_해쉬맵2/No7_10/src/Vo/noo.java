package Vo;

import java.util.Scanner;
import java.util.Vector;

public class noo {
	Vector<Shape> v=new Vector<Shape>(); 
	Scanner scn=new Scanner(System.in);
	
	public void insert() {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int a=scn.nextInt();
		
		switch(a) {
		case 1:
			Shape line=new Line();
			v.add(line);
			break;
		
		case 2:
			Shape rect=new Rect();
			v.add(rect);
			break;
		case 3:
			Shape circle=new Circle();
			v.add(circle);
			break;
		}
}
		public void view() {
			for(int i=0;i<v.size();i++) {
				System.out.println(v.get(i).Shape());
			}
		}
		public void del() {
			int z=scn.nextInt();
			for(int i=0;i<v.size();i++) {
				if(i==z-1) {
					v.remove(i);
				}
			}
		}
}
