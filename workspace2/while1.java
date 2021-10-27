//사용자에게 입력받아 -1이 입력되면 멈추고 입력한 값 모두더하기
package workspace2;
import java.util.Scanner;
public class while1 {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("정수 5개 입력");
		int sum=0;
		
		for(int i=0; i<5; i++) {
			int a=scn.nextInt();
			
			if(a<=0.0)
				continue;
			else
				sum+=a;
		}
		System.out.println("합은"+sum);
		
		/*int count=0;//갯수
		int sum=0;//합
		System.out.println("-1을 입력시 이전 정수 합계가 나옴");
		Scanner scn=new Scanner(System.in);
		
		int a=scn.nextInt();//사용자정수입력
		
		while (a!=-1) {
			
			sum+=a;
			count++;
			a=scn.nextInt();//정수입력
		}
		
		if (count==0) {
			System.out.println("값을 입력하세요");
		}
		else {
			System.out.print("정수의 갯수는 :"+count+"이며");
			System.out.println("값의 평균은"+(double)sum/count+"입니다");
			
		}
		scn.close();*/
	}

}
