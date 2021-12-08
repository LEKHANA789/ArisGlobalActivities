package aris_day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	private int age;
	private String fname;
	private String lname;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public Person(int age, String fname, String lname) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "[ age= "+age+" ,first name= "+fname+" ,last name= "+lname+ " ]";
	}
	
}
public class Assignment {
public static void main(String[] args) {
	Person Ajay=new Person(25,"Ajay","kumar");
	Person sham=new Person(25,"sham","P");
	Person Priya=new Person(25,"Priya","S");
	Person kiran=new Person(25,"kiran","kumar");
	Person sultan=new Person(25,"Sultan","ji");
	List<Person> ls=new ArrayList<Person>();
	ls.add(Ajay);
	ls.add(sham);
	ls.add(kiran);
	ls.add(Priya);
	ls.add(sultan);
	
	Collections.sort(ls,new Comparator<Person>(){
		@Override
		public int compare(Person p1, Person p2) {
			return p1.getLname().compareTo(p2.getLname());
		}
	}
);
	System.out.println(ls);
	for(Person p:ls) {
		if(p.getLname().startsWith("A"));{
			System.out.println(p);
		}
	}
	ls.forEach(p->{
		if(p.getLname().startsWith("s"));
		System.out.println(p);
	});
}
}
