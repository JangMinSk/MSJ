package asdasd;

import java.util.Scanner;

class Add {
	int a;
	int b;
	String c;

	public Add() {
	}
	Add(int a,int b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void calculate() {//연산실행문
			int d=a+b;
			System.out.println(a+c+b+"="+d);			

	}
}


class Sub {
	int a;
	int b;
	String c;
	public Sub() {}
	Sub(int a,int b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void setValue() {
		
	}
	public void calculate() {
			int d=a-b;
			System.out.println(a+c+b+"="+d);
	}
}

class Mul{
	int a;
	int b;
	String c;
	public Mul() {}
	Mul(int a,int b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public void calculate() {
		int d=a*b;
		System.out.println(a+c+b+"="+d);
	}
}
class Div{
	int a;
	int b;
	String c;
	public Div() {}
	Div(int a,int b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void setValue() {
		
	}
	public void calculate() {
		int d=a/b;
		System.out.println(a+c+b+"="+d);
	}
}
public class zaz {

	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오>>");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		String c=scn.next();
		if(c.equals("+")) {
			Add add=new Add(a,b,c);
			add.calculate();			
		}
		else if(c.equals("-")) {
			Sub sub=new Sub(a,b,c);
			sub.calculate();			
		}
		else if(c.equals("*")) {
			Mul mul=new Mul(a,b,c);
			mul.calculate();			
		}
		else if(c.equals("/")) {
			Div div=new Div(a,b,c);
			div.calculate();			
		}
	}
}
