package asdasd;

class Person{
	String name;
	String id;
	
	public Person(String name) {
		this.name=name;
	}
}
class Student extends Person{
	String grade;
	String department;
	
	public Student(String Person) {
		super(Person);
	}
}
public class up_dawn {

	public static void main(String[] args) {		
		Person p=new Student("¿Ã¿ÁπÆ");
		Student s;
		s=(Student)p;
		s.grade="A";
		System.out.println(p.name+s.grade);
		
	}

}
