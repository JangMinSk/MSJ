package work;

import java.util.Scanner;


class Day {
	private String work;
	
	public void set(String work) {
		this.work=work;
	}
	public String get() {
		return work;
	}
		public void show() {
		
		if(work==null)
			System.out.println("�����ϴ�");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class Month {	
		Scanner scn=new Scanner(System.in); //��� ������ �ƴ϶� �� ������..? ���˶ߴ°��� ��Ŭ���� �ȿ��� �ֱ� ����.
		int Day; //��Ŭ������ ����... ��¥�� ��Ÿ�� ����.
		Day[] b;//��Day�� �ٸ� ���� ����.
		
		Month(int a){// ������
			this.Day=a; //a�� �̰�ü�� Day��
			b=new Day[a];//Day[a]�� b�� ������ ������.
			for(int i=0;i<b.length;i++) {		//b�� ��������
				b[i]=new Day();	//��Day�� �����ϴ� �Ű�ü (b[i])�ϼ�.
			}
	}

		public void input() {	//�Է°� �޴� ����
			System.out.println("��¥(1~30)?");
			int day=scn.nextInt();//��ĳ���� ���� �Ӹ��� �� Ȱ���ؾ� ��Ǯ��.
			System.out.println("����(��ĭ�����Է�): ");
			String work=scn.next();
			b[day].set(work);//�ٸ� ���� �� ���� �� ������..���
		}
		public void view() {//�������� �ִ� ����
			System.out.println("��¥(1~30)?");
			int day=scn.nextInt();
			b[day].show();		
		}
		public void finish() {
				System.out.println("���α׷��� �����մϴ�");
		}
				
		
		public  void run() {
			while(true) {					//������ �������� run�ȿ� �־���� ��???: �̤����� ��������̱� ������..
			System.out.println("���� (�Է�:1, ����:2, ������:3)");	
			int a=scn.nextInt();
			if(a==1) input();
			else if (a==2) view();
			else if (a==3) {
				finish();
				break;
			}
		}
		}	
						
	public static void main(String[] args) {
		System.out.println("�̹��� ������ ���� ���α׷�.");		
		Month a=new Month (30);
		for(int i=0;i<31;i++) {
			
		}
		a.run();
}
}