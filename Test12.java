//사칙연산 프로그램 ch=+-*/ 피연산자 실수 0으로나눌시 0으로 나눌수없습니다 출력
package Frd;
import java.util.Scanner;
public class Test12 {
	
	public static void main(String[] args) {
		System.out.println("나눌때 0을넣지마세요..ㅠ");
		int a=0;
		int b=0;
		String aa;
		Scanner scn=new Scanner(System.in);
		
		System.out.print("첫번째 값 :");
		a=scn.nextInt();

		System.out.print("연산자 입력");
		aa=scn.next();
		
		System.out.print("두번째 값 :");
		b=scn.nextInt();
		
		switch(aa) {
		case "+":
			System.out.println(a+"+"+b+"="+(a+b));
		case "-":
			System.out.println(a+"-"+b+"="+(a-b));
		case "*":
			System.out.println(a+"*"+b+"="+(a*b));
		case "/":
			System.out.println(a+"/"+b+"="+(a/b));
			}
		scn.close();
		
//		if (aa.equals("+")) {
//			System.out.println(a+"+"+b+ "=" +(a+b));
//		}
//		if(aa.equals("-")) {
//			System.out.println(a+"-"+b+"="+(a-b));
//		}
//		if(aa.equals("*")) {
//			System.out.println(a+"*"+b+"="+(a*b));
//		}
//		if(aa.equals("/")) {
//			System.out.println(a+"/"+b+"="+(a/b));
//		if(a==0||b==0) {
//				System.out.println("0으로 할수 없음");
//		}
//		}
//		scn.close();
		
	}
	}
