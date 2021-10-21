//&1=1100원이며 원 입력시 달러로 환산.
package workspace;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("얼마를 달러로 바꾸겠습니까?");
		int a=scn.nextInt();
		double b=1100;
		
		System.out.println(a+"원은"+a/b+"&입니다");
	
	}

}
