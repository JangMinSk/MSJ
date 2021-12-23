package AL;

import java.util.ArrayList;
import java.util.Scanner;

public class aryLi {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			System.out.print("학점 입력>>");
			String sc=scn.next();
			a.add(sc);
			System.out.println(a);
		}
		double result=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals("A")) {
				result+=4.0;
			}
			if(a.get(i).equals("B")) {
				result+=3.0;
			}
			if(a.get(i).equals("C")) {
				result+=2.0;
			}
			if(a.get(i).equals("C")) {
				result+=1.0;
			}
			if(a.get(i).equals("C")) {
				result+=0.0;
			}
		}System.out.println("평균>>"+result/6);
		}
	}