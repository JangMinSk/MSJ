package Main;

import java.util.Scanner;
import java.util.Vector;

import Vo.Nation;

public class ma {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Vector<Nation> nt = new Vector<Nation>();
		System.out.println("****���� ���߱� ������ �����մϴ�.****");

		boolean sstop=true;
		while (sstop) {
			System.out.print("�Է�:1, ����:2, ����:3>>");
			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				while (true) {
					System.out.print("����� ���� �Է�>>");
					String c = scn.next();
					if (c.equals("�׸�")) {
						break;
					}
					String c1 = scn.next();
					Nation kor = new Nation(c, c1);
					nt.add(kor);
					}break;
			case 2:
				while (true) {					
				Nation Quiz=nt.get((int) (Math.random() * nt.size() - 1));
				System.out.println(Quiz.getCountry()+"�� ������?");
				String good=scn.next();
				if(good.equals("�׸�")) {
					break;
				}
				if(Quiz.getCapital().equals(good)) {
					System.out.println("����");
				}else {					
					System.out.println("��");
				}			
			}break;
			case 3:
				System.out.println("�����մϴ�.");
				sstop=false;
				break;
		}
	}
}
}