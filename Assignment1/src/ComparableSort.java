import java.util.ArrayList;
import java.util.Collections;

class StudentList implements Comparable<StudentList>{
	int rollno;
	String name;
	int age;
	public StudentList(int rollno, String name, int age) {
		
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(StudentList st) {
		// TODO Auto-generated method stub
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else return -1;
	}
	
	
}
public class ComparableSort {
public static void main(String[] args) {
	ArrayList<StudentList> a1=new ArrayList<StudentList>();
	a1.add(new StudentList(101,"Lekhana",22));
	a1.add(new StudentList(102,"Chethana",21));
	a1.add(new StudentList(103,"Sahana",20));
	Collections.sort(a1);
	for(StudentList st:a1) {
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
}
}
