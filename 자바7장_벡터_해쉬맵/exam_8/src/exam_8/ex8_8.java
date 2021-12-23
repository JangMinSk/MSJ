package exam_8;
import java.io.File;
public class ex8_8{
	

public static void e(File dir) {
	System.out.println("----"+dir.getPath()+"의 서브 리스트 입니다.-----");
	
	File[] subFiles=dir.listFiles();
	
	for(int i=0;i<subFiles.length;i++) {
		File f=subFiles[i];
		long t=f.lastModified();
		System.out.println(f.getName());
		System.out.println("\t파일 크기:"+f.length());
		System.out.printf("\t수정한 시간:%tb %td %ta %tT\n",t,t,t,t);
	}
}
	public static void main(String[] args) {
		File f1=new File("c:\\Users\\YJ\\eclipse-workspace\\ex8-3.txt");
		System.out.println(f1.getPath()+","+f1.getPath()+","+f1.getPath());
		
		String res="";
		if(f1.isFile())res="파일";
		else if(f1.isDirectory())res="디렉토리";
		System.out.println(f1.getPath()+"은"+res+"입니다");
		
		File f2=new File("c:\\Users\\YJ\\eclipse-workspace\\ex8-3.txt");
		if(!f2.exists()) {
			f2.mkdir();
		}
		e(new File("c:\\Users\\YJ\\eclipse-workspace"));
		f2.renameTo(new File("c:\\Users\\YJ\\eclipse-workspace\\ex8-22.txt"));
		
		e(new File("c:\\Users\\YJ\\eclipse-workspace"));
	}
}