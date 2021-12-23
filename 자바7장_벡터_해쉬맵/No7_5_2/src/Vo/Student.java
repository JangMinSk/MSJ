package Vo;

public class Student {
	private String name;
	private Integer num;
	private Integer no;
	private Double all;

	public Student(String name,Integer num, Integer no, Double all) {
		this.name=name;
		this.num=num;
		this.no=no;
		this.all=all;
	}

	public String getName() {
		return name;
	}
	public Integer getNum() {
		if(num<0) {				
			num=num*-1;
		}
		return num;
	}
	public Integer getNo() {
		if(no<0) {				
			no=no*-1;
		}
		return no;
	}
	public Double getAll() {
		return all;
	}
	
	@Override
	public String toString() {
	
		return name+"\n"+"학과="+num+"\n"+"번호="+no+"\n"+"학점평균="+all+"\n"+"--------------------------";
}
}