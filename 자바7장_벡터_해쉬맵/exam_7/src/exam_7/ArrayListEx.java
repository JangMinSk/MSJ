package exam_7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		//���ڿ��� ���� ������ ArrayList ����
		ArrayList<String> a=new ArrayList<String>();
		
		//Ű����κ��� 4���� �̸� �Է¹޾� ArrayList�� ����
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("�̸��� �Է��ϼ���>>");
			a.add(scn.next());
		}
		//ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i=0;i<a.size();i++) {
			String name=a.get(i);
			System.out.println(name+" ");
		}
		//���� �� �̸� ���
		int longestIndex=0;//���� ���� �� �̸��� �ִ� ArrayList ���� �ε���
		for(int i=1;i<a.size();i++) {
			if(a.get(longestIndex).length()<a.get(i).length())//�̸� ���� ��
					longestIndex=i;//i ��° �� �ִ� �̸��� �� �� ���̵�.
		}
		System.out.println("\n���� �� �̸��� :"+a.get(longestIndex));
		System.out.println("�迭�� ���̴� :"+a.size());
	}
}