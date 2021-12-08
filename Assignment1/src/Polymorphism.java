 class Car{
	 void speed() {
		 System.out.println("car speed is usually 100kmph");
	 }
 }
	
	 class Tata extends Car{
		 void speed() {
			 System.out.println("tata car speed is usually 150kmph");
		 }
	 }
	 
	 class Nano extends Car{
		 void speed() {
			 System.out.println("nano car speed is usually 130kmph");
		 }
	 }
 
public class Polymorphism {
public static void main(String[] args) {
	Car c;
	c=new Tata();
	c.speed();
	c=new Nano();
	c.speed();
	
}
}
