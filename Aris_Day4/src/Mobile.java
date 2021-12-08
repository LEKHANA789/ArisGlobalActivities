
public class Mobile {

	private String model;
	private double price;
	public String getModel() {
		 return model;
		 
	 }
	 public void setModel(String model) {
		 this.model=model;
	 }
	 public double getprice() {
		 return price;
		 
	 }
	 public void setPrice(double price) {
		 this.price=price;
	 }
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.setModel("Nokia");
		System.out.println(m.getModel());
		m.setPrice(25000);
		System.out.println(m.getprice());
	}
}
