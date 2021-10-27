package asa;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] a=new int[10];
		
		for(int i=0;i<10;i++) {
			a[i]=(int) (Math.random()*10+1);
		}
		double sum=0;
		for(int i=0;i<10;i++) {
			sum+=a[i];
		System.out.print("ЗЃД§"+a[i]);
		}
		System.out.println("ЦђБе"+sum/10);
	}

}
