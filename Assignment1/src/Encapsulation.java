  class Student{
	 private String name;
	 private int age;
	 private double perc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
	 
 }
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s1=new Student();
		s.setAge(21);
		System.out.println(s.getAge());
		s.setPerc(72.8);
		System.out.println(s.getPerc());
		s.setName("Lekhana");
		System.out.println(s.getName());
		s1.setAge(22);
		System.out.println(s1.getAge());
		s1.setPerc(80.6);
		System.out.println(s1.getPerc());
		s1.setName("Chetana");
		System.out.println(s1.getName());
	}

}
