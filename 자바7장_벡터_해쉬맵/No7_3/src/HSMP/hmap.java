package HSMP;
import java.util.*;

public class hmap {
	public static void main(String[] args) {
		HashMap cun=new HashMap<String,Integer>();
		Scanner scn=new Scanner(System.in);
		System.out.println("�����̸��� �α��� �Է� ����:�׸�");
		while(true) {
		String name = scn.next();
		if(name.equals("�׸�")) {
			System.out.println("�����մϴ�");
			scn.nextLine();
			break;
		}
		else {
			int num = scn.nextInt();
			cun.put(name,num);
			System.out.println("�����̸�,�α���>>"+cun);					
		}
}
		
		while(true) {
			System.out.println("�α��� �˻�>>");
			String mame=scn.nextLine();	
			if(mame.equals("�׸�")) {
				System.out.println("�����մϴ�");
				scn.nextLine();
				break;
			}
			System.out.println(cun.get(mame));
		}
	}
}