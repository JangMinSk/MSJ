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
	String Word="�ƹ���";
	int lastIndex = word.length() -1; //������ ���ڿ� ���� �ε���
	char lastChar = word.charAt(lastIndex); //������ ����
	char firstChar = word.charAt(0); //ù ���� ����
	if(lastChar==firstChar) {//���� �� �ƴϸ� �ƴϴ� �����ձ� ����.
		return true;
		
	}	return false;
	 
}
	}

public class Test1 {//���Ӿ�
	public static void main(String[] args) {
		System.out.println("��� �����ϳ�");
		Scanner scn=new Scanner(System.in);
		
		int no=scn.nextInt();
		int i = 0;
		boolean suc=true;
		
		
	}
}