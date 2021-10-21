package workspace;
import java.util.Scanner;
public class Test8 {
public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("x,y좌표를 입력하시오");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int d=scn.nextInt();
		int x1=a;
		int y1=b;
		int x2=c;
		int y2=d;
		
		
		if (x1<=200&&x1>=100||y1<=200&&y1>=100||x2<=200&&x2>=100||y2<=200&&y2>=100) {
					
			System.out.println("사각형 안에 들어갑니다!");
			
		}
		else{
			System.out.println("사각형 밖에 있습니다");
			}
		

	}

}
