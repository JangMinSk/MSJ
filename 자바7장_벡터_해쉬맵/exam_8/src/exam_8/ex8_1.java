package exam_8;
import java.io.*;
import java.io.IOException;

public class ex8_1 {

	public static void main(String[] args) {
		FileReader fin=null;
		try {
			fin=new FileReader("c:\\windows\\system.ini");//���� �Է� ��Ʈ�� ����
			int c;
			while((c=fin.read()) !=-1) {//�� ���ھ� ���� ������ �б�
				System.out.println((char)c);
			}
			fin.close();//���̻� ��� ����
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}

	}

}
