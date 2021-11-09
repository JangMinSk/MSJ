package asdasd;

class Person{
	private int weight;//프리베이트 클레스 맴버내에서만 공유
	int age;	//디폴트로 패키지 공유
	protected int height;	//상속자식,패키지공유
	public String name;	//다공유
	
	public void setWeight(int weight) {// 프리베이트 웨이트이기 떄문에 set,get으로 매개변수값을 받아서 this.weight로 지정해줌.
		this.weight=weight;
	}
	public int getWeight() {
		return weight;//this에 넣기위해 리턴을 사용 (겟,셋)
	}
}
class student extends Person{//펄슨 클레스 익스텐드를 이용해 상속
	public void set() {     //패키지내에 모든 클래스 공유
		age=30;//값지정
		name="홍길동";
		height=175;
		setWeight(99);
		System.out.println(age+" "+name+" "+height+" "+this.getWeight());//출력
	}
}
public class wow {

	public static void main(String[] args) {
	student s=new student();//생성자를 생성
	s.set();//s생성자에 set지정
	}

}