package RPC;

import java.util.Scanner;

public class RPC {

	public static void main(String[] args) {
		String ary[]= {"가위","바위","보"};
		Scanner scn=new Scanner(System.in);
		String p[]=new String[1];
		String com[]=new String[1];
		boolean a =true;
		p[0]=ary[0];
	
		while(a){
			System.out.println("철수[가위(1),바위(2),보(3),끝내기(4)]>>");
			String sc=scn.nextLine();
			
		switch(sc) {
		
		case "1":
			com[0]=ary[(int)(Math.random()*3)];
			if(com[0].equals("가위")) {
				System.out.println("비겻습니다");
				break;
			}
			else if(com[0].equals("보")) {
				System.out.println("철수가 이겻습니다");
				break;
			}
			else {
				
				System.out.println("졌습니다");
				break;
			}
		case "2":
			p[0]=ary[0];
			com[0]=ary[(int)(Math.random()*3)];
			if(com[0].equals("바위")) {
				System.out.println("비겻습니다");
				break;
			}
			else if(com[0].equals("가위")) {
				System.out.println("철수가 이겻습니다");
				break;
			}
			else {				
				System.out.println("졌습니다");
				break;
			}
		case "3":
			p[0]=ary[0];
			com[0]=ary[(int)(Math.random()*3)];
			if(com[0].equals("보")) {
				System.out.println("비겻습니다");
				break;
			}
			else if(com[0].equals("바위")) {
				System.out.println("철수가 이겻습니다");
				break;
			}
			else {				
				System.out.println("졌습니다");
				break;
			}
		case "4":
			System.out.println("종료합니다...");
			a=false;			
		}
	}

}
}
