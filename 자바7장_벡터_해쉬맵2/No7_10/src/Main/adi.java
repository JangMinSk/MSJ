package Main;

import java.awt.Shape;
import java.util.Scanner;
import java.util.Vector;
import Vo.*;
public class adi {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		noo p = new noo();		
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		boolean v=true;
		while(v) {
		System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
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
