package No_1;

import java.util.Scanner;
import java.util.Vector;

public class No_1 {

	public static void main(String[] args) {
		Vector v=new Vector<Integer>();//���� v��ä ����<��Ʈ>��
		System.out.println("����-1�Է��� ���� ���ϴ� ���� ����");
		Scanner scn=new Scanner(System.in);			
		while(true) {
			int sc=scn.nextInt();//������Է°�
			if(sc==-1) {//1�̸� ����
				System.out.println("����");
				break;
			}
			v.add(sc);//����v�� ����� �Է°� �Է�
			System.out.println("���� ������ ����>>"+v.toString());//���� ����� ����v ���	

		}
		System.out.print("���� ū ����>>");
		int  max=0;//��ä ����
		for(int i=0;i<v.size();i++) {//������ ��������ŭ for
			if(max < (int)v.get(i)) {//��ü �߽��� v.size��ŭ ���鼭 ū ���� ���� i���� �ֱ����� ���ǹ�
				max=(int)v.get(i);//�߽��� �̰�.
			}
		}System.out.println(max);
	}
}