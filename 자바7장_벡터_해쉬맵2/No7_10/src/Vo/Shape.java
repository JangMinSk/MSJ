package Vo;

abstract class Shape {	
	abstract String Shape();
	
}
class Rect extends Shape{
	@Override
	String Shape() {
		return "Rect";
	}
}
class Line extends Shape{
	@Override
	String Shape() {	
		return "Line";
	}	
}	
class Circle extends Shape{
	@Override
	String Shape() {
		return "Circle";
	}	
}