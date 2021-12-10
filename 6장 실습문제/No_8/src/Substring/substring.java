package Substring;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		System.out.println("문자 아무거나 띄어쓰기로 작성");
		Scanner scn=new Scanner(System.in);
		String sc=scn.nextLine();		
		for(int i=1;i<sc.length()+1;i++) {
			System.out.print(sc.substring(i));//i부터 입력 문자열 값의 끝까지 출력
			System.out.println(sc.substring(0,i));//0번째~i번째 까지만 출력
			}
	}

}
