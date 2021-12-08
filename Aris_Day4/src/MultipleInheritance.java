//
interface A{
	void display();
}
abstract class B{
abstract void display() ;
void hello() {
	System.out.println("hello abstract in java");
}
}
//we cannot able to create the interface and abstract class objects 
//we are able to create objects of extends or implements class
class C extends B implements A{
	@Override
	public void display() {
		System.out.println("abstract class in child");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		C c=new C();
		c.display();
	}
//public class MultipleInheritance {

	}


