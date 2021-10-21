//(200,200)안의 (100,100)의 x,y좌표가 포함되는지 알아내라.
package workspace;
import java.util.Scanner;
public class Test7 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("점 (x,y)의 좌표를 입력하시오");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int x=a;
		int y=b;
				
		if (x<=100||0<=x) {
		if (y<=100||0<=y)
			System.out.println(x+","+y+"는 사각형 안에 있습니다");
		}
		
		else if (x<=200 ||100<x) {
		if (y<=200 || 100<y)
			System.out.println(x+","+y+"는 사각형 안에 있습니다");
		}
	}

}
