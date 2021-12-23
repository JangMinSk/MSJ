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
			System.out.println("없습니다");
		else System.out.println(work + "입니다.");
	}
}

public class Month {	
		Scanner scn=new Scanner(System.in); //얘는 메인이 아니라 왜 여깃지..? 스켄뜨는곳이 이클레스 안에만 있기 떄문.
		int Day; //위클래스랑 별개... 날짜를 나타냄 변수.
		Day[] b;//윗Day의 다리 역할 변수.
		
		Month(int a){// 생성자
			this.Day=a; //a가 이객체의 Day다
			b=new Day[a];//Day[a]가 b의 범위를 정해줌.
			for(int i=0;i<b.length;i++) {		//b의 범위측정
				b[i]=new Day();	//윗Day랑 연결하는 매개체 (b[i])완성.
			}
	}

		public void input() {	//입력값 받는 ㅅㅋ
			System.out.println("날짜(1~30)?");
			int day=scn.nextInt();//스캐너의 주축 임마를 잘 활용해야 잘풀림.
			System.out.println("할일(빈칸없이입력): ");
			String work=scn.next();
			b[day].set(work);//다리 역할 이 ㅅㅋ 가 메인임..사실
		}
		public void view() {//보기위해 있는 ㅅㅋ
			System.out.println("날짜(1~30)?");
			int day=scn.nextInt();
			b[day].show();		
		}
		public void finish() {
				System.out.println("프로그램을 종료합니다");
		}
				
		
		public  void run() {
			while(true) {					//여러번 돌려야함 run안에 있어야함 왜???: 이ㅅㅋ가 출발지점이기 떄문에..
			System.out.println("할일 (입력:1, 보기:2, 끝내기:3)");	
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
		System.out.println("이번달 스케쥴 관리 프로그램.");		
		Month a=new Month (30);
		for(int i=0;i<31;i++) {
			
		}
		a.run();
}
}