package exam_8;

import java.io.*;

public class ex8_5 {

	public static void main(String[] args) {
		byte b[]= {7,51,3,4,-1,24};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.ioi");
			for(int i=0;i<b.length;i++) 
				fout.write(b[i]);
			fout.close();
			
		}
			catch(IOException e) {
				System.out.println("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.ioi�� ������ �� �������ϴ� ���Ȯ�� ��Ź�帳�ϴ�.");
				return;
			}
			System.out.println("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.ioi�� �����Ͽ����ϴ�");

	}

}
