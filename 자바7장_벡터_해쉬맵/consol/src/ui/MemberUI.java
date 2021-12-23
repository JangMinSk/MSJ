package ui;

import java.util.Scanner;

import action.*;//패키지명.클레스명
import controller.MemberController;
import vo.Member;

public class MemberUI {
	public static Member[] memberArray = new Member[0];// 객체 배열

	public static void main(String[] args) {

		MemberController memberController = new MemberController();// 객체 생성
		Scanner sc = new Scanner(System.in);
		Action action = null;// 요청 처리 객체
		int menu = 0;
		while(true) {
			System.out.println("====회원데이터 관리====");
			System.out.println();
			System.out.print("1.회원 가입");// (create)
			System.out.print("2.회원 목록 보기");// (Read)
			System.out.print("3.회원 정보 수정");// (Update)
			System.out.print("4.회원 정보 삭자");// (Delete)
			System.out.print("5.회원 정보 검색");// (Read)
			System.out.print("6.프로그램 종료");

			System.out.println("메뉴 번호:");
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
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("메뉴 항목중 골라주세요!");
			}
			if (action != null) {
				memberController.processRequest(sc, action);
	  } //action!=null
	}	//while
  }	//main
}//calss