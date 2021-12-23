package HSMP;
import java.util.*;

public class hmap {
	public static void main(String[] args) {
		HashMap cun=new HashMap<String,Integer>();
		Scanner scn=new Scanner(System.in);
		System.out.println("나라이름과 인구수 입력 종료:그만");
		while(true) {
		String name = scn.next();
		if(name.equals("그만")) {
			System.out.println("종료합니다");
			scn.nextLine();
			break;
		}
		else {
			int num = scn.nextInt();
			cun.put(name,num);
			System.out.println("나라이름,인구수>>"+cun);					
		}
}
		
		while(true) {
			System.out.println("인구수 검색>>");
			String mame=scn.nextLine();	
			if(mame.equals("그만")) {
				System.out.println("종료합니다");
				scn.nextLine();
				break;
			}
			System.out.println(cun.get(mame));
		}
	}
}