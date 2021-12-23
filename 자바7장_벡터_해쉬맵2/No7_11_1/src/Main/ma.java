package Main;

import java.util.Scanner;
import java.util.Vector;

import Vo.Nation;

public class ma {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Vector<Nation> nt = new Vector<Nation>();
		System.out.println("****수도 맞추기 게임을 시작합니다.****");

		boolean sstop=true;
		while (sstop) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>>");
			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				while (true) {
					System.out.print("나라와 수도 입력>>");
					String c = scn.next();
					if (c.equals("그만")) {
						break;
					}
					String c1 = scn.next();
					Nation kor = new Nation(c, c1);
					nt.add(kor);
					}break;
			case 2:
				while (true) {					
				Nation Quiz=nt.get((int) (Math.random() * nt.size() - 1));
				System.out.println(Quiz.getCountry()+"의 수도는?");
				String good=scn.next();
				if(good.equals("그만")) {
					break;
				}
				if(Quiz.getCapital().equals(good)) {
					System.out.println("정답");
				}else {					
					System.out.println("땡");
				}			
			}break;
			case 3:
				System.out.println("종료합니다.");
				sstop=false;
				break;
		}
	}
}
}