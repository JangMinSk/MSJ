package main;

import java.util.ArrayList;
import java.util.Scanner;
import Vo.*;

public class no_5 {
	// 1.�л� �̸�,�а�,�й�,��������� ���� ��̸���ƮEŬ��������(4��)
	// 2.string,Integer,Double3���� E�Ű������� �޴� �ټ»���
	// 3.��ü����� �ϴ� �޼ҵ� ����ϱ�(������ for���� �̿��Ͽ� get�غ���.�ٵ� ������?)
	// 4.�̸��� �Է¹޴� ��ĳ�ʰ����� �ش� �ε����� ����ϱ�(ex>equals�� ã���� �ɵ�?)
	// 5.�׸��� �Է��ϸ� break;�ϱ�.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> ar = new ArrayList<Student>();
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
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
			System.out.println("�˻��� �л� �̸�");
			String ser = scn.next();
			if (ser.equals("�׸�")) {
				System.out.println("�����մϴ�.");
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
					System.out.println("���Է�");
				}

			}
		}

	}
}