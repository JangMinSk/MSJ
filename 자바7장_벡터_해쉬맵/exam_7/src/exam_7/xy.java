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
		Vector<xy> v=new Vector<xy>(); //xy ��ü�� ��ҷ� �ٷ�� ���� ����
		v.add(new xy(2,3));
		v.add(new xy(-5,20));
		v.add(new xy(30,-8));
		
		v.remove(1); //�ε��� 1�� xy(-5,20) ��ü ����
		
		//���Ϳ� �ִ� xy ��ü ��� �˻��Ͽ� ���
		for(int i=0;i<v.size();i++) {
			xy p =v.get(i); //������ i ��° xy ��ü  ����
			System.out.println(p); //p.toString()�� �̿��Ͽ� ��ü p ���
		}
	}
}
