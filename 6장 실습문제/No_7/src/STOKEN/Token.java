package STOKEN;
import java.util.*;
public class Token {

	public static void main(String[] args) {
		while(true) {
			Scanner scn=new Scanner(System.in);
			String a=scn.nextLine();
			StringTokenizer st=new StringTokenizer(a," ");
			int n=st.countTokens();
			if(a.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;				
			}			
			System.out.println("������ ����="+n);	
		}			
	}		
}