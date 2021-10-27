package workspace2;

public class for1 {

	public static void main(String[] args) {
		/*int num=0;
		int i=0;
			
		for (; i<=10; i++) {
				
			num+=i;	
			System.out.print(i);
		
		if (i<=9)
		System.out.print("+");
		else {
			System.out.print("=");
			System.out.print(num);
		}
		}*/
		
		for(int i=1;i<10; i++) {
		for(int j=1;j<10; j++) {
			System.out.print(i+"*"+j+"="+(i*j));
			System.out.print('\t');
		}
		System.out.println();
		}
	}

}
