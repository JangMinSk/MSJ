package RPC;

import java.util.Scanner;

public class RPC {

	public static void main(String[] args) {
		String ary[]= {"����","����","��"};
		Scanner scn=new Scanner(System.in);
		String p[]=new String[1];
		String com[]=new String[1];
		boolean a =true;
		p[0]=ary[0];
	
		while(a){
			System.out.println("ö��[����(1),����(2),��(3),������(4)]>>");
			String sc=scn.nextLine();
			
		switch(sc) {
		
		case "1":
			com[0]=ary[(int)(Math.random()*3)];
			if(com[0].equals("����")) {
				System.out.println("�����ϴ�");
				break;
			}
			else if(com[0].equals("��")) {
				System.out.println("ö���� �̰���ϴ�");
				break;
			}
			else {
				
				System.out.println("�����ϴ�");
				break;
			}
		case "2":
			p[0]=ary[0];
			com[0]=ary[(int)(Math.random()*3)];
			if(com[0].equals("����")) {
				System.out.println("�����ϴ�");
				break;
			}
			else if(com[0].equals("����")) {
				System.out.println("ö���� �̰���ϴ�");
				break;
			}
			else {				
				System.out.println("�����ϴ�");
				break;
			}
		case "3":
			p[0]=ary[0];
			com[0]=ary[(int)(Math.random()*3)];
			if(com[0].equals("��")) {
				System.out.println("�����ϴ�");
				break;
			}
			else if(com[0].equals("����")) {
				System.out.println("ö���� �̰���ϴ�");
				break;
			}
			else {				
				System.out.println("�����ϴ�");
				break;
			}
		case "4":
			System.out.println("�����մϴ�...");
			a=false;			
		}
	}

}
}
