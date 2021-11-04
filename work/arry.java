package work;

import java.util.Scanner;

public class arry {

	public static void main(String[] args) {
		System.out.println("정수5개를 입력하세요");
		Scanner n=new Scanner(System.in);
		int ar[]=new int [5];
		int max=0;
		for(int i=0;i<5;i++) {
			ar[i]=n.nextInt();
			if(ar[i]>max)
			max=ar[i];
			
		}
		System.out.println(max);
	}

}
