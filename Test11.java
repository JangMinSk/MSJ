package Frd;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("1~12의 정수를 입력하세요");
		int num=scn.nextInt();
		
		switch(num) {
		case 1 :
		case 2 :
		case 12:
			System.out.println("겨울");
		}
		switch(num) {	
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
		}
		switch(num) {	
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
		switch(num) {
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
		}
		
		default :
			System.out.println("정수를 다시 입력");
		
		
//		int a=scn.nextInt();
//				
//		int aa=a;
//			
//			
//		
//	
//			System.out.println(a);
//		
//
//		if (a>=3&&aa<=5) {
//			System.out.println("봄");	
//		}
//		else if (a>=6&&a<=8) {
//			System.out.println("여름");
//		}
//		else if (a>=9&&a<=11) {
//			System.out.println("가을");
//		}
//		else if (a>=1&&a<3||a==12) {
//			System.out.println("겨울");
//		}
//		else {
//			System.out.println("null");
//		}
}}}
