package workspce;

import java.util.Scanner;

class pp{
	public String name;
	public String word;
	
	public pp(String name){
		this.name=name;
	}
	
	public String Word() {
		Scanner in=new Scanner(System.in);
		word=in.next();
		return word;
	}


public boolean suc(String word){
	String Word="아버지";
	int lastIndex = word.length() -1; //마지막 문자에 대한 인덱스
	char lastChar = word.charAt(lastIndex); //마지막 문자
	char firstChar = word.charAt(0); //첫 번쨰 문자
	if(lastChar==firstChar) {//같은 참 아니면 아니다 끝말잇기 공식.
		return true;
		
	}	return false;
	 
}
	}

public class Test1 {//게임앱
	public static void main(String[] args) {
		System.out.println("몇명 참가하냐");
		Scanner scn=new Scanner(System.in);
		
		int no=scn.nextInt();
		int i = 0;
		boolean suc=true;
		
		
	}
}