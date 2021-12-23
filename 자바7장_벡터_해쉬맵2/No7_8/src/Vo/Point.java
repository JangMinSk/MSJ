package Vo;

public class Point {
	private String name;
	private Integer score;
	
	public Point(String name,Integer score){
		this.name=name;
		this.score=score;
	}
	public String getName() {
		return name;
	}
	public Integer getScore() {
		return score;
	}

	@Override
	public String toString() {
		return name + "," + score;
	}
}
