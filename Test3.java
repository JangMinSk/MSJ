//총금액 중 오만원,만원,천원,백원,오십원,십원,일원 으로 몇개씩 나오는지 알아내라. 
package workspace;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("5만원 이상의 금액을 입력하시오");
		int a=scn.nextInt();
		int b=50000;
		int c=10000;
		int d=1000;
		int e=100;
		int f=50;
		int g=10;
		int h=1;
		
		System.out.println("오만원권"+a/b+"매");
		System.out.println("만원권"+(a%b)/c+"매");
		System.out.println("천원권"+(a%b%c)/d+"매");
		System.out.println("백원권"+(a%b%c%d)/e+"매");
		System.out.println("오십원"+(a%b%c%d%e)/f+"매");
		System.out.println("십원"+(a%b%c%d%e%f)/g+"매");
		System.out.println("일원"+(a%b%c%d%e%f%g)/h+"매");
		

	}

}
