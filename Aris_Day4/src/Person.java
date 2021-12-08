
public class Person {

	private String name;
	private int age;
	private String address;
	 public String getName() {
		 return name;
		 
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public int getAge() {
		 return age;
		 
	 }
	 public void setAge(int age) {
		 this.age=age;
	 }
	 public String getAddress() {
		 return address;
		 
	 }
	 public void setAddress(String address) {
		 this.address=address;
	 }
	 public static void main(String[] args) {
		Person p=new Person();
		p.setName("Lekhana");
		System.out.println(p.getName());
		p.setAge(20);
		System.out.println(p.getAge());
		p.setAddress("Kodaganur");
		System.out.println(p.getAddress());
	}


}
