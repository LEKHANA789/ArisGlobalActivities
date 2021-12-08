

public class MobileInheritance {

	String model;
	int price;
	void call() {
		System.out.println("we can make call");
	}
	void sendSms() {
		System.out.println("we can send  sms");
	}
}
class Nokia extends MobileInheritance{
	void fastInternet() {
		System.out.println("special feature of fast internet speed");
	}
}
class Sony extends MobileInheritance{
	void dualsim() {
		System.out.println("special feature of dual sim");
	}
}

class Samsung extends MobileInheritance{
	void Frontcamera() {
		System.out.println("special feature of front camera");
	}
	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.model="samsung galaxy s21";
		s.price=20000;
		System.out.println(s.model);
		System.out.println(s.price);
		s.call();
		s.sendSms();
		s.Frontcamera();
		
	}
}


