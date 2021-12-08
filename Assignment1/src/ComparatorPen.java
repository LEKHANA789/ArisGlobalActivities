import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Pen1 {
	int price;
	String name;
	public Pen1(int price, String name) {
		
		this.price = price;
		this.name = name;
	}
}
class priceComparator implements Comparator<Pen1>{
	public int compare(Pen1 p1, Pen1 p2) {
		if(p1.price==p2.price)
			return 0;
		else if(p1.price>p2.price)
			return 1;
		else
			return -1;
	}
}
class NameComparator1 implements Comparator<Pen1>{
	public int compare(Pen1 p1, Pen1 p2) {
		return p1.name.compareTo(p2.name);
	}
}
public class ComparatorPen {
	public static void main(String[] args) {
		ArrayList<Pen1> p1=new ArrayList<Pen1>();
		p1.add(new Pen1(15,"Parker"));
		p1.add(new Pen1(10,"Bright"));
		p1.add(new Pen1(5,"Reynolds"));
		System.out.println("Sorting by name");
		Collections.sort(p1,new NameComparator1());
		for(Pen1 p:p1) {
			System.out.println(p.price+" "+p.name);
		}
		System.out.println("Sorting by price");
		Collections.sort(p1,new priceComparator());
		for(Pen1 p:p1) {
			System.out.println(p.price+" "+p.name);
		}
	}


}
