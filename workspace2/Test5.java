//양정수 입력값중 3의배수만 출력하게하라
package asa;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int num[]=new int[10];
		System.out.println("정수 넣어");
		for (int i=0;i<10;i++) {
			num[i]=scn.nextInt();
			if(num[i]%3==0) {
				
				System.out.println("3의 배수는"+num[i]);
			}
			
	
		}
		
	}

}
