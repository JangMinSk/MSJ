package workspce;

public class exam {
	int radius;
	public exam(int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius=radius;
	}

	public static void main(String[] args) {
		exam ob1=new exam(1);
		exam ob2=new exam(2);
		exam s;
		
		ob1=ob2;
		s=ob1;
		
		System.out.println("ob1.radius="+ob1.radius);
		System.out.println("ob2.radius="+s.radius);
	}

}
