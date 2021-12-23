package main;

import java.util.HashMap;
import java.util.Scanner;

import Vo.Student;

public class ma {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		HashMap<String,Student> ar = new HashMap<String,Student>();
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			String name = scn.next();
			Integer num = scn.nextInt();
			Integer no = scn.nextInt();
			Double all = scn.nextDouble();
			ar.put(name,new Student(name,num,no,all));
		}
		for(String key:ar.keySet()) {//for each문 for(리턴값 key:해쉬맵 래퍼런스.keyset())
			System.out.println(ar.get(key).toString());		
		}
		while(true) {
			System.out.println("검색할 학생 이름");
			String ser = scn.next();
			if (ser.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				int n = 0;
				System.out.println(ser);
				for (String key:ar.keySet()) {
					if (ar.get(key).getName().equals(ser)) {
						System.out.println(ar.get(key));
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