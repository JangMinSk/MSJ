package workspce;

import java.util.Scanner;

class Book{
	String title,author;//변수값의 그릇을 만들고 클레스를 생성
	public Book(String title,String author) {//
		this.title=title;//그후 클레스 안에서 this로 지정시켜준다
		this.author=author;
	}
}
public class exam2 {
	public static void main(String[] args) {
		Book [] book = new Book[2];//메인 클레스 안에서 변수,객체에 대해 배열 값을 선언
		
		Scanner scn= new Scanner(System.in);//스케너를 활용해서 지정값 저장
		for(int i=0;i<book.length;i++) {//for 문을 이용해 범위를 지정한다.
			System.out.println("제목>>");
			String title=scn.nextLine();// nextLine<<<라인을쓰는 이유는 한줄 전체를 출력하기위함.
			System.out.println("저자>>");
			String author=scn.nextLine();
			book[i]=new Book(title,author);//처음 선언한 this값이 book이라는 객체의 i배열로 간다
		}
		for (int i=0;i<book.length;i++)
			System.out.println("("+book[i].title+","+book[i].author+")");//위쪽 범위값으로 옮겨도 되지만 출력값 합계를 한번에 나오게하기 위해 따로지정.
	}

}
