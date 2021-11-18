package over;
abstract class PairMap{//추상 클레스
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	
	
	abstract String delete(String key);
	
	abstract int length();
}

class Dictionary extends PairMap{//추상클레스를 상속받은 클레스
	
	public Dictionary(int i) {//생성자 (매개변수)
		this.keyArray=new String[i];//(매개변수 받는)배열선언
		this.valueArray=new String[i];
	}
	
	
	@Override
	String get(String key) {
		for(int i=0;i<keyArray.length;i++) {//입력받는 key값을 비교하여 벨류배열을 리턴받음
			if(keyArray[i].equals(key))
				return valueArray[i];		
		}	
				return null; 
}
	@Override
	void put(String key, String value) {//키,밸류의 배열 예외처리		
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
	String delete(String key) {//기태씨의 값을 배열에서 널값으로 삭제
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
		dic.put("황기태","자바");
		dic.put("이재문","파이썬");
		dic.put("이재문","C++");
		System.out.println("이재문의 값은"+dic.get("이재문"));
		System.out.println("황기태의 값은"+dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은"+dic.get("황기태"));
	}

}
