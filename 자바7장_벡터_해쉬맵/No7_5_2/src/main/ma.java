package main;

import java.util.HashMap;
import java.util.Scanner;

import Vo.Student;

public class ma {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		HashMap<String,Student> ar = new HashMap<String,Student>();
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			String name = scn.next();
			Integer num = scn.nextInt();
			Integer no = scn.nextInt();
			Double all = scn.nextDouble();
			ar.put(name,new Student(name,num,no,all));
		}
		for(String key:ar.keySet()) {//for each�� for(���ϰ� key:�ؽ��� ���۷���.keyset())
			System.out.println(ar.get(key).toString());		
		}
		while(true) {
			System.out.println("�˻��� �л� �̸�");
			String ser = scn.next();
			if (ser.equals("�׸�")) {
				System.out.println("�����մϴ�.");
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
					System.out.println("���Է�");
			}
		}
	}
}
}