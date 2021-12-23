package exam_8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex8_3 {

	public static void main(String[] args) {
		InputStreamReader in=null;
		
		FileInputStream fin=null;
		try {
			fin= new FileInputStream("c:\\\\Users\\\\YJ\\\\eclipse-workspace\\\\ex8-2.txt");
			
			in = new InputStreamReader(fin,"US-ASCII");
			
			int c;
			
			System.out.println("인코딩 문자 집합은"+in.getEncoding());
			while((c=in.read()) !=-1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
