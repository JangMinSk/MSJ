package workspace2;

public class Test2 {

	public static void main(String[] args) {
		int[][]  n= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for (int i=0; i<n.length; i++) {
			int[] b=n[i];
			
			for(int j=0;j<b.length;j++) {
				
				System.out.print(b[j]+" ");
			}
			System.out.println();
		}
	}
}