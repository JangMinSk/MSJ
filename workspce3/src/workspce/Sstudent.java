package workspce;

public class Sstudent {

	public static void main(String[] args) {
		 Student s = new Student();
	      s.name = "ȫ���";
	      s.ban =1;
	      s.no =2;
	      s.kor = 80;
	      s.eng = 30;
	      s.math = 15;
	      Student s1 = new Student("ȫ�浿",1,1,100,60,76 );
	      
	      
	      System.out.println("�̸� : " + s.name);
	      System.out.println("���� : " + s.getTotal());
	      System.out.println("��� : " + s.getAverage());
	      
	      System.out.println(s1.info());
	      System.out.println(s.info());
	   }
	}

	class Student{
	   String name;
	   int ban;
	   int no;
	   int kor;
	   int eng;
	   int math;
	   
	   Student(){}
	   
	   Student(String name, int ban, int no, int kor, int eng, int math){
	      this.name = name;
	      this.ban = ban;
	      this.no = no;
	      this.kor = kor;
	      this.eng = eng;
	      this.math = math;
	   }

	   int getTotal() {
	      return kor + eng + math;
	   }
	   float getAverage() {
	      return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
	   }
	   String   info() {
	      return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	   }
	}