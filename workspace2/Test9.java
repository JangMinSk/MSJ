//4 4 2차원배열 1~10 범위정수 랜덤생성 
package Frd;

public class Test9 {

	public static void main(String[] args) {
		
		int [][]a=new int[4][4];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(int)(Math.random()*10+1);
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("");
		}
		 
	}

}
