package exam_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex8_4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		FileWriter fout =null;//파일쓰기의 fout  null객체 생섯
		int c;//c로 저장공간 에 대한 다리역할.
		try {
			fout = new FileWriter("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.txt");
			while(true) {
				String line=scn.nextLine();//입력값 받는 놈
				if(line.length()==0)
					break;
				fout.write(line, 0, line.length());//읽은 문자열을 파일에 저장 입력받은 line 문자열 0번부터 line의 길이까지 입력 
				fout.write("\r\n",0,1);//한 줄 띄기 위해 \r\n을 파일에 저장
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scn.close();

	}

}
