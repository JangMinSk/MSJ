package Domain;
import Vo.*;
public class run {

	public static void main(String[] args) {
		Circle a=new Circle(2,3,5);//중심 2,3에 반지름 5인 원
		Circle b=new Circle(2,3,30);//중심 2,3에 반지름 30인 점
		System.out.println("원 a :" + a);
		System.out.println("원 b :" + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("다른 원");
	}
}
