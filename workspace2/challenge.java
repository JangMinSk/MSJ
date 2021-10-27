//랜덤을 돌려서 나온숫자의 업and다운
package workspace2;
import java.util.Random;
import java.util.Scanner;
public class challenge {

	public static void main(String[] args) {
		System.out.println("랜덤 숫자맞추기");
		Random r=new Random();
		int k =r.nextInt(100);
					
		while(true) {
			Scanner text=new Scanner(System.in);
			int a=text.nextInt();
			int num=a;
			if(num<k) {
				a=num++;
				System.out.println("높게");
				continue;
			}
			
			if(num>k) {
			System.out.println("낮게");
			continue;
			}
		
			else if(num==k) {
			System.out.println("정답");
			System.out.println("1번더y,싫으면n");
			
			 String aa=text.next();//종료를위함 Y,n
			if(aa=="y") {
					continue;				
			}
			else {
					
				break;
			}
			}
		}
		}}
