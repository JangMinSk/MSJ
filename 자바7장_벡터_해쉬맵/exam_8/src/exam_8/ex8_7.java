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
	//�ƿ����۽�Ʈ�� ���� �ش��ο� �ִ� �ؽ�Ʈ������ �о� ����5��ŭ ��� 
			//�ѱ������ BufferedWriter out = new BufferedWriter(new OutputStreamWriter((System.out),5);
			BufferedOutputStream out=new BufferedOutputStream(System.out,5);
			while((c=fin.read())!=-1) {
				out.write(c);//���⼭ ���� �����Ͱ� ��� ��µ� out�� ���۸���ƿ�ǲ��Ʈ������ (����5��ŭ)
			}
			new Scanner(System.in).nextLine();//��������� ENTER�� �Է¹����� ��������
			out.flush();//out�� fin�� ���ϰ�ο��ִ� ���Ͽ� ������ ����Ʈ���� ��
			fin.close();
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
