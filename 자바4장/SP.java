package over;

import java.util.Scanner;
class Seat{
	Scanner scn=new Scanner(System.in);
	String S[]=new String[10];
	String A[]=new String[10];
	String B[]=new String[10];
	Seat(){
		
		
		for (int i=0;i<10;i++) {//�¼� �ѿ��� ���� Ŭ����
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

		
		System.out.print("�̸�>>");
		String m=scn.next();
		 
		System.out.print("�¼���ȣ ����>>");
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
		System.out.print("�¼�����: S(1), A(2), B(3)>>");
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
			System.out.print("�¼�����: S(1), A(2), B(3)>>");
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
			System.out.print("�̸�>>");
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
	System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
	System.out.println("����:1, ��ȸ:2, ���:3, ������:4");
	int seat=scn.nextInt();
	if(seat==1) 		a.names();//����
	else if(seat==2) 	a.allseat();//��ȸ
	else if(seat==3)	a.del();//���
	else if(seat==4) break;//������
	else if(seat>=5) System.out.println("�ٽ� �õ�");
}
}
}