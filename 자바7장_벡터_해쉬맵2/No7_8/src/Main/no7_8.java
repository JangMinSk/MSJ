package Main;

import java.util.HashMap;
import java.util.Scanner;

import Vo.Point;

public class no7_8 {
	public static void main(String[] args) {
		System.out.println("**포인트 관리 프로그램입니다**");
		Scanner scn=new Scanner(System.in);
		HashMap<String,Point> p=new HashMap<String,Point>();
			while(true) {			
			System.out.println("이름과 포인트 입력>>");
			String name=scn.next();
			if(name.equals("그만")) {
				System.out.println("종료");
				break;				
			}
			Integer score=scn.nextInt();
			for(String key:p.keySet()) {
				if(p.get(key).getName().equals(name)) {
				int a=p.get(key).getScore();
				score+=a;
				}					
			}
			p.put(name,new Point(name,score));
			System.out.println(p.toString());	
		}
	}
}