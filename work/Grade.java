package work;

import java.util.Scanner;

public class Grade {
	int math,science,english;
	
	
	public Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}
	
		int average() {
			return (math+science+english)/3;
			
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.print("����,����,���� ������ 3���� ���� �Է�>>");
		int math=scn.nextInt();
		int science=scn.nextInt();
		int english=scn.nextInt();
		Grade me =new Grade(math,science,english);
		System.out.println("�����"+me.average());
	}

}
