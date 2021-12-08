abstract class Bike{
	Bike(){
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
	
}
class Honda4 extends Bike{
	void run() {
		System.out.println("running safely..");
	}
	
}
public class Abstraction{
	public static void main(String[] args) {
		Bike b=new Honda4();
		b.run();
		b.changeGear();
	}
}