package Main;

import java.awt.Shape;
import java.util.Scanner;
import java.util.Vector;
import Vo.*;
public class adi {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		noo p = new noo();		
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		boolean v=true;
		while(v) {
		System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
		Integer no=scn.nextInt();			
		switch(no) {		
		case 1:
			p.insert();
			break;
		case 2:
			p.del();
			break;
		case 3:
			p.view();
			break;
		case 4:
			v=false;
			break;
}
}
}
}
