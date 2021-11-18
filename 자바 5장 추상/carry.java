package over;
abstract class PairMap{//�߻� Ŭ����
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	
	
	abstract String delete(String key);
	
	abstract int length();
}

class Dictionary extends PairMap{//�߻�Ŭ������ ��ӹ��� Ŭ����
	
	public Dictionary(int i) {//������ (�Ű�����)
		this.keyArray=new String[i];//(�Ű����� �޴�)�迭����
		this.valueArray=new String[i];
	}
	
	
	@Override
	String get(String key) {
		for(int i=0;i<keyArray.length;i++) {//�Է¹޴� key���� ���Ͽ� �����迭�� ���Ϲ���
			if(keyArray[i].equals(key))
				return valueArray[i];		
		}	
				return null; 
}
	@Override
	void put(String key, String value) {//Ű,����� �迭 ����ó��		
			for(int i=0;i<keyArray.length;i++) {
			if(keyArray[i]==null) {
				keyArray[i]=key;
				valueArray[i]=value;					
				break;
			}
			if(keyArray[i].equals(key)) {
				valueArray[i]=value;					
				break;
			}
		}
	}
	@Override
	String delete(String key) {//���¾��� ���� �迭���� �ΰ����� ����
		for(int i=0;i<keyArray.length;i++) {
			if(keyArray[i].equals(key)) {
				valueArray[i]=null;
				return null;								
			}
		
	}
		return null;
}
	@Override
	int length() {	
		return 0;
	}
	
}
public class carry {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����","�ڹ�");
		dic.put("���繮","���̽�");
		dic.put("���繮","C++");
		System.out.println("���繮�� ����"+dic.get("���繮"));
		System.out.println("Ȳ������ ����"+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ����"+dic.get("Ȳ����"));
	}

}
