package exam_8;
import java.io.*;
public class ex8_6 {

	public static void main(String[] args) {
		byte b[]=new byte[6];
		try {
			FileInputStream fin=new FileInputStream("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.ioi");
			int n=0;
			int c;
			while((c=fin.read())!=-1) {
				b[n]=(byte)c;
				n++;
			}
			System.out.println("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.ioi���� ���� �迭�� ����մϴ�");
			for(int i=0;i<b.length;i++)
				System.out.print(b[i]+" ");
			System.out.println();
			fin.close();
		}
		catch(IOException e) {
			System.out.println("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.ioi���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
		}

	}

}
