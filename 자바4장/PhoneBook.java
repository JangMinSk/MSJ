package work;

import java.util.Scanner;

class phone {
	 String name; //�̸� �ʵ�
	 String tel; //���� �ʵ�
	phone(String name,String tel){
		this.name=name;
		this.tel=tel;
		
	}
}

public class PhoneBook { //������ ����� �� �Է� �ް� Phon ��ü �迭 ����
	Scanner scn=new Scanner(System.in);
	phone[] Book; //��ü�迭 �����
	

	public void input(int a) {
		Book=new phone[a];//��ü�迭 ����
		for(int i=0;i<a;i++) {
			System.out.print("�̸� ���� �Է�");
			String name=scn.next();
			String tel=scn.next();
			Book[i]=new phone(name,tel);
		}
	}
	
	public void SAS(String b) {
		int z=0; //�ʱ�ȭ
		for(int i=0;i<Book.length;i++) {//
			if(Book[i].name.equals(b)) {//equals ���ڿ� ��
				System.out.println(Book[i].tel);
				z++;//�迭 ����
				
			}
		}
			if(z==0)
			System.out.println(b+"�� �����ϴ�.");
	}
	
	public void run() {
		while(true) {
			System.out.println("�ο����� �Է� �ϼ���");
			int a=scn.nextInt();
			input(a);
			System.out.println("�˻��� �̸�");
			String b=scn.next();
			SAS(b);
			if (a==0)
				
				break;
			
			}
		}	
	
	public static void main(String[] args) {
		System.out.println("2���� Ŭ���� �����,��ü �迭 �ٷ��");
		
		PhoneBook a=new PhoneBook();			
			a.run();
	}
}