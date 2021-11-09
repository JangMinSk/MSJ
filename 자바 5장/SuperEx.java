package work5;

class Point{
	private int x,y; //클레스내에 공유x,y
	public Point() {//생성자
		this.x=this.y=0;//x,y this =0
	}
	public Point(int x, int y) { //int xy 값을 담는 변수
		this.x=x; this.y = y; //매개변수 this x,y 값을 담는다
	}
	public void showPoint() {// 출력
		System.out.println("("+x+","+y+")");
	}
}
class Colorpoint extends Point{// 부모 상속 클래스
	private String color;// 문자 색깔 클래스내 공유
	public Colorpoint(int x, int y, String color) {// 컬러포인트 매개변수 3개
		super(x,y); // 부모의 매개변수 xy값을 지정시키기 위해 쓰임 <<슈퍼안쓰면 생성자한테 안가서 오류가뜸.
		this.color=color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();//부모 포인트값으로 감.
	}
}
public class SuperEx {

	public static void main(String[] args) {
		Colorpoint cp=new Colorpoint(5,6,"blue"); //매개변수 있는 생성자.
		cp.showColorPoint();
		
	}

}
