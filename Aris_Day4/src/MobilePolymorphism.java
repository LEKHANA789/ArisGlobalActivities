class Mobile2{
	int price;
	void call() {
		System.out.println("call");
	}
	void sendsms() {
		System.out.println("sendsms");
	}
	
}
class Iphone extends Mobile2{
	@Override
	void call() {
		System.out.println("we can make videocall");
	}
}
class Apple extends Mobile2{
	@Override
	void call() {
		System.out.println("we can make international videocall");
	}
}
public class MobilePolymorphism extends Mobile2 {
@Override
void call() {
	System.out.println("we can make both videocall and audiocall");
}
public static void main(String[] args) {
	MobilePolymorphism m=new MobilePolymorphism();
	m.call();
	m.sendsms();
}
	
	}
	
