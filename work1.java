package workspace;
import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	
				
		for (int i=0;i<1;i++) {
			int num=(int)(Math.random()*3);
			System.out.println("가위 바위 보 선택");
			String b = scn.next();
			System.out.println();
			if(b.equals("가위")) {
				if(num==0) {
					System.out.println("나:가위");
					System.out.println("상대편:바위");
					System.out.println("졌습니다");
				}
			}
			if(b.equals("바위")) {
				if(num==1) {
					System.out.println("나:바위");
					System.out.println("상대편:바위");
					System.out.println("비겼습니다");
					
				}
			}
			if(b.equals("보")) {
				if(num==2) {
					System.out.println("나:보");
					System.out.println("상대편:바위");
					System.out.println("이겼습니다");
				}
			}
			
	}

}
}