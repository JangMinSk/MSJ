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
				System.out.println("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.ioi에 저장할 수 없었습니다 경로확인 부탁드립니다.");
				return;
			}
			System.out.println("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.ioi에 저장하였습니다");

	}

}
