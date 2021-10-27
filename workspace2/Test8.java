//100보다작은 입력값(정수배열) 받고 이값을 랜덤하게 삽입 해라 (중복없이) 
package Frd;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("정수를 몇개 저장할 것 인지 적어라.");
		Scanner scn=new Scanner(System.in);
		
		int b=scn.nextInt();
		int[]a= new int[b];
		
		for (int i=0;i<b;i++) {
			a[i]=(int)(Math.random()*100+1);
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					i--;
				}
			}
		} 
		
		for(int i=0;i<b;i++) {
		
			System.out.print(a[i]+"   ");
		if(i!=0&& i%10==9) {
			System.out.println();
			}		
		}		
	}
}