package over;

import java.util.Scanner;

public class GraphicEditor {
	private String name;
	private shape start=null, last=null;
	private Scanner scn=new Scanner(System.in);
	public GraphicEditor(String name) {
		this.name=name;
	}
	
	public void run() {
		System.out.println("�׷��� �����"+name+"�� �����մϴ�");
		int choice=0;//����,����,��κ���,���� 
		int num=0;//������ ��ȣ ����,��Ʈ ��Ŭ
		while(choice!=4) {
			System.out.println("����(1), ����(2), ��� ����(3), ����(4) >>>");
			choice=scn.nextInt();
			switch(choice) {
			case 1://insert()
				System.out.println("Line(1), Rect(2), Circle(3)");
				num =scn.nextInt();
				if(num<1 || num>3) {
					System.out.println("re try");
					break;
				}
				insert(num);
				break;
			case 2://delete()
				System.out.println("������ ������ ��ġ>>");
				num = scn.nextInt();
				if(!delete(num)) {
					System.out.println("���� �Ұ���");
				}
				break;
			case 3:		//show()
				shape t= start;
				while(t!=null) {
					t.draw();
					t=t.getNext();
				}
				break;
			case 4:
				System.out.println(name+" "+"done");
				break;
			default:
				System.out.println("1~4�� �Է�");
			}			
	}		
}
	private void insert(int num) {
		shape obj=null;
		switch(num) {
		case 1:
			obj=new Line();
			break;
		case 2:
			obj=new Rect();
			break;
		case 3:
			obj=new Circle();
			break;
	}
		if(start==null) {
			start=last=obj;
		}
		else {
			last.setNext(obj);
			last=obj;
		}
}
		private boolean delete(int num) {
			shape cur=start;//�ʱⰪ���� ���Ͽ� �����迭���� �Űܰ�����.
			shape pre=start;
			if(start==null) {
				return false; 
			}
				
			for(int i=0;i<num;i++) {
				pre=cur;
				cur = cur.getNext();
				if(cur==null) {
					return false;
				}
			}		
			if(start==last) {
				start=last=null;
				return true;
			}
			if(cur==start) {
				start=start.getNext();
			}
			else if(cur==last) {
				last=pre;
				last.setNext(null);
			}
			else {
				pre.setNext(cur.getNext());
			}
			return true;
}
	public static void main(String[] args) {
		GraphicEditor ge= new GraphicEditor("beauty");
		ge.run();

	}

}
