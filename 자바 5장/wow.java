package asdasd;

class Person{
	private int weight;//��������Ʈ Ŭ���� �ɹ��������� ����
	int age;	//����Ʈ�� ��Ű�� ����
	protected int height;	//����ڽ�,��Ű������
	public String name;	//�ٰ���
	
	public void setWeight(int weight) {// ��������Ʈ ����Ʈ�̱� ������ set,get���� �Ű��������� �޾Ƽ� this.weight�� ��������.
		this.weight=weight;
	}
	public int getWeight() {
		return weight;//this�� �ֱ����� ������ ��� (��,��)
	}
}
class student extends Person{//�޽� Ŭ���� �ͽ��ٵ带 �̿��� ���
	public void set() {     //��Ű������ ��� Ŭ���� ����
		age=30;//������
		name="ȫ�浿";
		height=175;
		setWeight(99);
		System.out.println(age+" "+name+" "+height+" "+this.getWeight());//���
	}
}
public class wow {

	public static void main(String[] args) {
	student s=new student();//�����ڸ� ����
	s.set();//s�����ڿ� set����
	}

}