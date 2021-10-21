//3 6 9 °¡³ª¿À¸é ¹Ú¼öÂ¦ 369 Áßº¹ÀÌ ³ª¿À¸é ¹Ú¼öÂ¦Â¦
package workspace;
import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		System.out.println("(1~99) »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À");
		Scanner scn=new Scanner(System.in);
		
		int a=scn.nextInt();
		
		int num=a/10;//10À¸·Î ³ª´« ¸ò
		int num1=a%10;//10À¸·Î ³ª´« ³ª¸ÓÁö

		if (num%10==3) {
			System.out.println("¹Ú¼öÂ¦Â¦");
			}
		 if (num%10==6) {
			 System.out.println("¹Ú¼öÂ¦Â¦");
		 }
		 if (num%10==9) {
			
			System.out.println("¹Ú¼öÂ¦Â¦");
		}
		 
		 if(10>=a) {
		  if (num1==3) 
			System.out.println("¹Ú¼öÂ¦");			
		 
		 if (num1==6) { 
				System.out.println("¹Ú¼öÂ¦");			
			 }
		 if (num1==9) { 
				System.out.println("¹Ú¼öÂ¦");			
			 }}
}}
