package No_1;

import java.util.Scanner;
import java.util.Vector;

public class No_1 {

	public static void main(String[] args) {
		Vector v=new Vector<Integer>();//백터 v객채 생성<인트>값
		System.out.println("정수-1입력전 까지 원하는 숫자 삽입");
		Scanner scn=new Scanner(System.in);			
		while(true) {
			int sc=scn.nextInt();//사용자입력값
			if(sc==-1) {//1이면 종료
				System.out.println("종료");
				break;
			}
			v.add(sc);//백터v에 사용자 입력값 입력
			System.out.println("현재 삽입한 숫자>>"+v.toString());//현재 저장된 백터v 출력	

		}
		System.out.print("가장 큰 수는>>");
		int  max=0;//빈객채 생성
		for(int i=0;i<v.size();i++) {//백터의 사지으만큼 for
			if(max < (int)v.get(i)) {//빈객체 멕스에 v.size만큼 돌면서 큰 정수 벡터 i값을 넣기위한 조건문
				max=(int)v.get(i);//멕스에 이관.
			}
		}System.out.println(max);
	}
}