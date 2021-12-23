package over;

import java.util.Scanner;
class Seat{
	Scanner scn=new Scanner(System.in);
	String S[]=new String[10];
	String A[]=new String[10];
	String B[]=new String[10];
	Seat(){
		
		
		for (int i=0;i<10;i++) {//좌석 한열에 대한 클레스
			S[i]="---";	
			A[i]="---";
			B[i]="---";
		}
	}
	void allseat() {
		System.out.print("S>>");
			for(int i=0;i<S.length;i++) {
				System.out.print(S[i]);
				System.out.print(" ");
			}
			System.out.println();
		System.out.print("A>>");
			for(int i=0;i<A.length;i++) {
				System.out.print(A[i]);
				System.out.print(" ");
				
			}
			System.out.println();
		System.out.print("B>>");
			for(int i=0;i<B.length;i++) {
				System.out.print(B[i]);
				System.out.print(" ");
			}
	}
	void name(String z) {

		
		System.out.print("이름>>");
		String m=scn.next();
		 
		System.out.print("좌석번호 ㄱㄱ>>");
		int num = scn.nextInt();
		if(z.equals("S")) {
			S[num-1]=m;					
		}
		else if(z.equals("A")) {
			A[num-1]=m;
			
		}
		else if(z.equals("B")) {
			B[num-1]=m;			
		}
	
	}
		void names() {
		System.out.print("좌석구분: S(1), A(2), B(3)>>");
		int di=scn.nextInt();
		if (di==1) {
			System.out.print("S>>");
			for(int i=0;i<S.length;i++) {
				System.out.print(S[i]);
				System.out.print(" ");
		}	
			System.out.println();
					name("S");
			
			
}
		else if(di==2) {
			System.out.print("A>>");
			for(int i=0;i<S.length;i++) {
				System.out.print(A[i]);
				System.out.print(" ");
		}
			System.out.println();
			name("A");
			
		}
		else if(di==3) {
			System.out.print("B>>");
			for(int i=0;i<S.length;i++) {
				System.out.print(B[i]);
				System.out.print(" ");
			}
			System.out.println();
			name("B");
			
	}

}
		
		void del() {
			System.out.print("좌석구분: S(1), A(2), B(3)>>");
			int di=scn.nextInt();
			if (di==1) {
				System.out.print("S>>");
				for(int i=0;i<S.length;i++) {
					System.out.print(S[i]);
					System.out.print(" ");
			}	
				dell("S");			
				System.out.println();
						
				
				
	}
			else if(di==2) {
				System.out.print("A>>");
				for(int i=0;i<S.length;i++) {
					System.out.print(A[i]);
					System.out.print(" ");
			}
				System.out.println();
				dell("A");
				
			}
			else if(di==3) {
				System.out.print("B>>");
				for(int i=0;i<S.length;i++) {
					System.out.print(B[i]);
					System.out.print(" ");
				}
				System.out.println();
				dell("B");
		}
	}	
		void dell(String z){
			System.out.println();
			System.out.print("이름>>");
			String m=scn.next();

			if(z.equals("S")) {
				for(int i=0;i<S.length;i++) {
					if(m.equals(S[i])) {
						S[i]="---";
					}
							
				}
			}
			else if(z.equals("A")) {
				for(int i=0;i<S.length;i++) {
					if(m.equals(A[i])) {
						A[i]="---";
					}
							
				}
			}
			else if(z.equals("B")) {
				for(int i=0;i<S.length;i++) {
					if(m.equals(B[i])) {
						B[i]="---";
					}
							
				}
			}
		}
	}
public class SP {

public static void main(String[] args) {

	Scanner scn=new Scanner(System.in);		
	Seat a=new Seat();
	while(true) {
	System.out.println();	
	System.out.println("명품콘서트홀 예약 시스템입니다.");
	System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4");
	int seat=scn.nextInt();
	if(seat==1) 		a.names();//예약
	else if(seat==2) 	a.allseat();//조회
	else if(seat==3)	a.del();//취소
	else if(seat==4) break;//끝내기
	else if(seat>=5) System.out.println("다시 시도");
}
}
}