//삼각형 만들기
package workspace;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		
		int max=a;
		int mid=b;
		int min=c;
		if (a+b>c) { 
		if (a+c>b)
		if (b+c>a)
			System.out.println("삼각형이 됩니다");
		}
		
		if (a+c==b) {
		if (a+b==c);
		System.out.println("삼각형이 안됩니다");	
		}
		
		if (a+c<b) {
		if (a+b<c)
		System.out.println("삼각형이 안됩니다");
		}
			
						}
	}