package ui;

import java.util.Scanner;

import action.*;//��Ű����.Ŭ������
import controller.MemberController;
import vo.Member;

public class MemberUI {
	public static Member[] memberArray = new Member[0];// ��ü �迭

	public static void main(String[] args) {

		MemberController memberController = new MemberController();// ��ü ����
		Scanner sc = new Scanner(System.in);
		Action action = null;// ��û ó�� ��ü
		int menu = 0;
		while(true) {
			System.out.println("====ȸ�������� ����====");
			System.out.println();
			System.out.print("1.ȸ�� ����");// (create)
			System.out.print("2.ȸ�� ��� ����");// (Read)
			System.out.print("3.ȸ�� ���� ����");// (Update)
			System.out.print("4.ȸ�� ���� ����");// (Delete)
			System.out.print("5.ȸ�� ���� �˻�");// (Read)
			System.out.print("6.���α׷� ����");

			System.out.println("�޴� ��ȣ:");
			menu = sc.nextInt();
			if(menu==1) {
				action = new MemberRegistAction();
				
				}
			else if(menu==2) {
				action = new MemberListAction();	
			}

			else if(menu==3) {
				action = new MemberUpdateAction();		
			}					
			else if(menu==4) {
				action = new MemberDeleteAction();
			
			}				
			else if(menu==5) {
				action = new MemberSearchAction();	
			}				
			else if(menu==6){
				System.out.println("���α׷� ����");
				break;
			}
			else {
				System.out.println("�޴� �׸��� ����ּ���!");
			}
			if (action != null) {
				memberController.processRequest(sc, action);
	  } //action!=null
	}	//while
  }	//main
}//calss