package Vo;

public class Word {
	private String key;
	private String value;
	
	public Word(String key,String value) {
		this.key=key;
		this.value=value;
	}
	public Object getKey() {	
		return key;
	}
	public String getValue() {
		return value;
	}
}