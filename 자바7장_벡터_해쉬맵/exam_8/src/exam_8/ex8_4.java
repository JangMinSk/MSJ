package exam_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex8_4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		FileWriter fout =null;//���Ͼ����� fout  null��ü ����
		int c;//c�� ������� �� ���� �ٸ�����.
		try {
			fout = new FileWriter("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.txt");
			while(true) {
				String line=scn.nextLine();//�Է°� �޴� ��
				if(line.length()==0)
					break;
				fout.write(line, 0, line.length());//���� ���ڿ��� ���Ͽ� ���� �Է¹��� line ���ڿ� 0������ line�� ���̱��� �Է� 
				fout.write("\r\n",0,1);//�� �� ��� ���� \r\n�� ���Ͽ� ����
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
		scn.close();

	}

}
