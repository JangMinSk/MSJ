package Substring;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		System.out.println("���� �ƹ��ų� ����� �ۼ�");
		Scanner scn=new Scanner(System.in);
		String sc=scn.nextLine();		
		for(int i=1;i<sc.length()+1;i++) {
			System.out.print(sc.substring(i));//i���� �Է� ���ڿ� ���� ������ ���
			System.out.println(sc.substring(0,i));//0��°~i��° ������ ���
			}
	}

}
