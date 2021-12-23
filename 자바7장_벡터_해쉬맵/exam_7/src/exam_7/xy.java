package exam_7;

import java.util.Vector;

public class xy {
	private int x,y;
	public xy(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}	
	public static void main(String[] args) {
		Vector<xy> v=new Vector<xy>(); //xy 객체를 요소로 다루는 벡터 생성
		v.add(new xy(2,3));
		v.add(new xy(-5,20));
		v.add(new xy(30,-8));
		
		v.remove(1); //인덱스 1의 xy(-5,20) 객체 삭제
		
		//벡터에 있는 xy 객체 모두 검색하여 출력
		for(int i=0;i<v.size();i++) {
			xy p =v.get(i); //벡터의 i 번째 xy 객체  얻어내기
			System.out.println(p); //p.toString()을 이용하여 객체 p 출력
		}
	}
}
