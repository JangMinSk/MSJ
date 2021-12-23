package No4;

import java.util.Scanner;
import java.util.Vector;

public class no4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Vector v=new Vector<Integer>();
		int c;
		while(true) {				
			System.out.println("강수량 입력(0 입력시 종료)"+"\n"+v.toString());
			c=scn.nextInt();
			v.add(c);
			double num=0;
			for(int i=0;i<v.size();i++) {
				int vn=(int)v.elementAt(i);
				num+=vn;								
			}System.out.println("현재 평균"+num/v.size());
			if(c==(0)) {
				System.out.println("종료합니다");
				break;
			}	
		}		
	}
}