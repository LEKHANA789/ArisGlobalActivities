import java.util.ArrayList;
import java.util.Collections;

class Pen implements Comparable<Pen>{
	int price;
	String name;
	
	public Pen(int price, String name) {
		
		this.price = price;
		this.name = name;
		
	}
	@Override
	public int compareTo(Pen p) {
		// TODO Auto-generated method stub
		if(price==p.price)
			return 0;
		else if(price>p.price)
			return 1;
		else 
			return -1;
	}
	
	
}
public class ComparablePen {
public static void main(String[] args) {
	ArrayList<Pen> p1=new ArrayList<Pen>();
	p1.add(new Pen(15,"Reynolds"));
	p1.add(new Pen(10,"Bright"));
	p1.add(new Pen(5,"Parker"));
	Collections.sort(p1);
	for(Pen p:p1) {
		System.out.println(p.price+" "+p.name);
	}
}
}


