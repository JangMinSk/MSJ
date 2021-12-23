package work;

public class Ractangle {
	int x;
	int y;
	int width;
	int height;
	
		int square() {
			return width*height;
		}
	void show() {
		System.out.println(x+","+y+"에서 크기가"+width+"X"+height+"인 직사각형");
	}
	boolean contains(Ractangle r) {
		   if(r.x > x && r.y > y && r.width + r.x < width + x && r.height + r.y < height + y) {
	            return true;
	            } 

	        return false;
	    }
		

	
	public Ractangle(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}

	public static void main(String[] args) {
		Ractangle r=new Ractangle(2,2,8,7);
		Ractangle s=new Ractangle(5,5,6,6);
		Ractangle t=new Ractangle(1,1,10,10);
	
		r.show();
		System.out.println("s의 면적은"+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다");
		if(t.contains(s)) System.out.println("t는 s을 포함합니다");
	}

}