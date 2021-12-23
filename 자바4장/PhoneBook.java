package work;

import java.util.Scanner;

class phone {
	 String name; //이름 필드
	 String tel; //전번 필드
	phone(String name,String tel){
		this.name=name;
		this.tel=tel;
		
	}
}

public class PhoneBook { //지정할 사람의 수 입력 받고 Phon 객체 배열 생성
	Scanner scn=new Scanner(System.in);
	phone[] Book; //객체배열 선언부
	

	public void input(int a) {
		Book=new phone[a];//객체배열 길이
		for(int i=0;i<a;i++) {
			System.out.print("이름 전번 입력");
			String name=scn.next();
			String tel=scn.next();
			Book[i]=new phone(name,tel);
		}
	}
	
	public void SAS(String b) {
		int z=0; //초기화
		for(int i=0;i<Book.length;i++) {//
			if(Book[i].name.equals(b)) {//equals 문자열 비
				System.out.println(Book[i].tel);
				z++;//배열 증가
				
			}
		}
			if(z==0)
			System.out.println(b+"이 없습니다.");
	}
	
	public void run() {
		while(true) {
			System.out.println("인원수를 입력 하세요");
			int a=scn.nextInt();
			input(a);
			System.out.println("검색할 이름");
			String b=scn.next();
			SAS(b);
			if (a==0)
				
				break;
			
			}
		}	
	
	public static void main(String[] args) {
		System.out.println("2개의 클래스 만들기,객체 배열 다루기");
		
		PhoneBook a=new PhoneBook();			
			a.run();
	}
}