package Frd;

public class Test10 {

	public static void main(String[] args) {
		int count=1;
		int n1=0;
		int n2=0;
		int a[][]=new int[4][4];
		
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(int)(Math.random()*10+1);				
			}
			}
		
		while(count<7) {
			n1 =  (int)(Math.random()*3);  
			n2 =  (int)(Math.random()*3); 
			
			if(a[n1][n2] != 0) {
				a[n1][n2] = 0;
				count++;
			}
		}
		
		// 배열 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(" "); 
}
		}}
