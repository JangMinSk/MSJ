package exam_8;
import java.io.File;
public class ex8_8{
	

public static void e(File dir) {
	System.out.println("----"+dir.getPath()+"�� ���� ����Ʈ �Դϴ�.-----");
	
	File[] subFiles=dir.listFiles();
	
	for(int i=0;i<subFiles.length;i++) {
		File f=subFiles[i];
		long t=f.lastModified();
		System.out.println(f.getName());
		System.out.println("\t���� ũ��:"+f.length());
		System.out.printf("\t������ �ð�:%tb %td %ta %tT\n",t,t,t,t);
	}
}
	public static void main(String[] args) {
		File f1=new File("c:\\Users\\YJ\\eclipse-workspace\\ex8-3.txt");
		System.out.println(f1.getPath()+","+f1.getPath()+","+f1.getPath());
		
		String res="";
		if(f1.isFile())res="����";
		else if(f1.isDirectory())res="���丮";
		System.out.println(f1.getPath()+"��"+res+"�Դϴ�");
		
		File f2=new File("c:\\Users\\YJ\\eclipse-workspace\\ex8-3.txt");
		if(!f2.exists()) {
			f2.mkdir();
		}
		e(new File("c:\\Users\\YJ\\eclipse-workspace"));
		f2.renameTo(new File("c:\\Users\\YJ\\eclipse-workspace\\ex8-22.txt"));
		
		e(new File("c:\\Users\\YJ\\eclipse-workspace"));
	}
}