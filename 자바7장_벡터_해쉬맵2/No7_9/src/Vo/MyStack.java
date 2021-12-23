package Vo;

public class MyStack<T> implements IStack<Integer> {
	int tos;
	Object []stck;
	public MyStack() {
		tos=0;
		stck=new Object[10];
	}
	@Override
	public Integer pop() {
		tos--;
		return (Integer)stck[tos];
	}

	@Override
	public boolean push(Integer ob) {
		stck[tos]=ob;
		tos++;
		return false;
	}

	
}
