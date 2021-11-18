package over;

public abstract class shape {
	private shape next;
	public shape() {
		next = null;}
	public void setNext(shape obj) {
		next=obj;
	}
	public shape getNext() {
		return next;
	}
	public abstract void draw();

}
