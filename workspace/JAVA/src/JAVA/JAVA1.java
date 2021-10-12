package JAVA;
import java.util.Scanner;
public class JAVA1 {

   public static void main(String[] args) {
	System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요");
	Scanner scn=new Scanner(System.in);
	
	String name=scn.next();
	System.out.println("이름은"+name+"입니다");
	
	String city=scn.next();
	System.out.println("도시는"+city+"입니다");
	
	int old=scn.nextInt();
	System.out.println("나이는"+old+"입니다");
	
	double kg=scn.nextDouble();
	System.out.println("체중은"+kg+"입니다");
	
	boolean isSingle=scn.hasNextBoolean();
	System.out.println("독신 여부는"+isSingle+"입니다");
	
	System.out.println("이름은:"+name+"\n사는곳은:"+city+"\n나이는:"+old+"\n몸무게는:"+kg+"\n독신 여부는:"+isSingle);
   }
}