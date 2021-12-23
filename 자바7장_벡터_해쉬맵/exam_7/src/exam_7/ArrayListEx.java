package exam_7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		//문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> a=new ArrayList<String>();
		
		//키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("이름을 입력하세요>>");
			a.add(scn.next());
		}
		//ArrayList에 들어 있는 모든 이름 출력
		for(int i=0;i<a.size();i++) {
			String name=a.get(i);
			System.out.println(name+" ");
		}
		//가장 긴 이름 출력
		int longestIndex=0;//현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
		for(int i=1;i<a.size();i++) {
			if(a.get(longestIndex).length()<a.get(i).length())//이름 길이 비교
					longestIndex=i;//i 번째 에 있는 이름이 더 긴 값이됨.
		}
		System.out.println("\n가장 긴 이름은 :"+a.get(longestIndex));
		System.out.println("배열의 길이는 :"+a.size());
	}
}