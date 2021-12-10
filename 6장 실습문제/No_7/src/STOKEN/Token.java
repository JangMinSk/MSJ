package STOKEN;
import java.util.*;
public class Token {

	public static void main(String[] args) {
		while(true) {
			Scanner scn=new Scanner(System.in);
			String a=scn.nextLine();
			StringTokenizer st=new StringTokenizer(a," ");
			int n=st.countTokens();
			if(a.equals("그만")) {
				System.out.println("종료합니다...");
				break;				
			}			
			System.out.println("어절의 개수="+n);	
		}			
	}		
}