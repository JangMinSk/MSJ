package workspce;

import java.util.Scanner;

class Book{
	String title,author;//�������� �׸��� ����� Ŭ������ ����
	public Book(String title,String author) {//
		this.title=title;//���� Ŭ���� �ȿ��� this�� ���������ش�
		this.author=author;
	}
}
public class exam2 {
	public static void main(String[] args) {
		Book [] book = new Book[2];//���� Ŭ���� �ȿ��� ����,��ü�� ���� �迭 ���� ����
		
		Scanner scn= new Scanner(System.in);//���ɳʸ� Ȱ���ؼ� ������ ����
		for(int i=0;i<book.length;i++) {//for ���� �̿��� ������ �����Ѵ�.
			System.out.println("����>>");
			String title=scn.nextLine();// nextLine<<<���������� ������ ���� ��ü�� ����ϱ�����.
			System.out.println("����>>");
			String author=scn.nextLine();
			book[i]=new Book(title,author);//ó�� ������ this���� book�̶�� ��ü�� i�迭�� ����
		}
		for (int i=0;i<book.length;i++)
			System.out.println("("+book[i].title+","+book[i].author+")");//���� ���������� �Űܵ� ������ ��°� �հ踦 �ѹ��� �������ϱ� ���� ��������.
	}

}
