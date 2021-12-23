package exam_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex8_11 {

	public static void main(String[] args) {
		File src=new File("c:\\Users\\YJ\\eclipse-workspace\\bg11.jpg");
		File dest= new File("c:\\Users\\YJ\\cpbg11.jpg");
		
		try {
			FileInputStream fi=new FileInputStream(src);
			FileOutputStream fo=new FileOutputStream(dest);
			byte[] buf=new byte[1024*10];
			while(true) {
				int n= fi.read(buf);
				fo.write(buf, 0, n);
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"��"+dest.getPath()+"�� �����Ͽ����ϴ�");
		}
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}

	}

}
