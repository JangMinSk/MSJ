package exam_8;

import java.io.*;

public class ex8_9 {
	public static void main(String[] args) {
		
	File src=new File("c:\\Users\\YJ\\eclipse-workspace\\ex8-2.txt");
	File dest= new File("c:\\Users\\YJ\\ex8-22.iti");
	
	int c;
	
	try {
		FileReader fr=new FileReader(src);
		FileWriter fw=new FileWriter(dest);
		while((c=fr.read())!=-1) {
			fw.write((char)c);
		}
			fr.close();
			fw.close();
			System.out.println(src.getPath()+"��"+dest.getPath()+"�� �����Ͽ����ϴ�");
	}
	catch(IOException e) {
		System.out.println("���� ���� ����");
	}
}
}