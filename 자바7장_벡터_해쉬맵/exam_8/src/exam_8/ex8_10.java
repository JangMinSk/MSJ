package exam_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex8_10 {

	public static void main(String[] args) {
		File src=new File("c:\\Users\\YJ\\eclipse-workspace\\bg11.jpg");
		File dest = new File("c:\\Users\\YJ\\cpbg11.jpg");
		int c;
		try {
			FileInputStream fi=new FileInputStream(src);
			FileOutputStream fo=new FileOutputStream(dest);
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"��"+dest.getPath()+"�� �����Ͽ����ϴ�");
		}
		catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}