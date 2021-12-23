package exam_8;
import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ex8_7 {

	public static void main(String[] args) {
		FileReader fin=null;
		int c;
		try {
			fin=new FileReader("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.txt");
	//아웃버퍼스트림 으로 해당경로에 있는 텍스트문서를 읽어 길이5만큼 출력 
			//한글출력은 BufferedWriter out = new BufferedWriter(new OutputStreamWriter((System.out),5);
			BufferedOutputStream out=new BufferedOutputStream(System.out,5);
			while((c=fin.read())!=-1) {
				out.write(c);//여기서 파일 데이터가 모두 출력됨 out의 버퍼리드아웃풋스트림으로 (길이5만큼)
			}
			new Scanner(System.in).nextLine();//사용자한테 ENTER를 입력받으면 다음실행
			out.flush();//out의 fin에 파일경로에있는 파일에 나머지 바이트값을 뱉어냄
			fin.close();
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
