package exam_8;
import java.io.*;
import java.io.IOException;

public class ex8_1 {

	public static void main(String[] args) {
		FileReader fin=null;
		try {
			fin=new FileReader("c:\\windows\\system.ini");//문자 입력 스트림 생성
			int c;
			while((c=fin.read()) !=-1) {//한 문자씩 파일 끝까지 읽기
				System.out.println((char)c);
			}
			fin.close();//더이상 사용 안함
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
