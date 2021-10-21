//최소,최대,중간 값나오게하기
package workspace;
import java.util.Scanner;
public class tet4 {
 
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		int max,mid,min;
		int num;
		max= scn.nextInt();
		mid= scn.nextInt();
		min= scn.nextInt();
		//???잘모르겟네..;;
		if(max<mid) {
			num=max;
			max=mid;
			mid=num;
		}
		if(max<min) {
			num=max;
			max=min;
			min=num;
		}
		if(mid<min) {
			num=mid;
			mid=min;
			min=num;
		}
		System.out.println("최대값"+max+"중간값"+mid+"최소값"+min);
	}
}

