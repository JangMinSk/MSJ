package main;

import java.util.ArrayList;
import java.util.Scanner;
import Vo.*;

public class no_5 {
	// 1.학생 이름,학과,학번,학점평균을 받을 어레이리스트E클래스생성(4인)
	// 2.string,Integer,Double3개의 E매개변수를 받는 겟셋생성
	// 3.전체출력을 하는 메소드 사용하기(없으면 for문을 이용하여 get해보기.근데 있을듯?)
	// 4.이름을 입력받는 스캐너값으로 해당 인덱스값 출력하기(ex>equals로 찾으면 될듯?)
	// 5.그만을 입력하면 break;하기.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> ar = new ArrayList<Student>();
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			String name = scn.next();
			Integer num = scn.nextInt();
			Integer no = scn.nextInt();
			Double all = scn.nextDouble();
			ar.add(new Student(name, num, no, all));
		}
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		while (true) {
			System.out.println("검색할 학생 이름");
			String ser = scn.next();
			if (ser.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}

			else {
				int n = 0;
				System.out.println(ser);
				for (int i = 0; i < ar.size(); i++) {
					if (ar.get(i).getName().equals(ser)) {
						System.out.println(ar.get(i));
						n++;
						break;
					}
				}
				if(n==0) {
					System.out.println("재입력");
				}

			}
		}

	}
}