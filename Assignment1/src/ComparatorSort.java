import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentList1 {
	int rollno;
	String name;
	int age;
	public StudentList1(int rollno, String name, int age) {
		
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}
//AgeComparator
class AgeComparator implements Comparator<StudentList1>{
	public int compare(StudentList1 s1, StudentList1 s2) {
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
}
class NameComparator implements Comparator<StudentList1>{
	public int compare(StudentList1 s1, StudentList1 s2) {
		return s1.name.compareTo(s2.name);
	}
}
public class ComparatorSort {
	public static void main(String[] args) {
		ArrayList<StudentList1> a1=new ArrayList<StudentList1>();
		a1.add(new StudentList1(101,"Lekhana",22));
		a1.add(new StudentList1(102,"Chethana",21));
		a1.add(new StudentList1(103,"Sahana",20));
		System.out.println("Sorting by name");
		Collections.sort(a1,new NameComparator());
		for(StudentList1 st:a1) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		System.out.println("Sorting by age");
		Collections.sort(a1,new AgeComparator());
		for(StudentList1 st:a1) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
