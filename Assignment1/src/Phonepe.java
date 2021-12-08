  interface BhimUPI{
	 void transfer(int amt);
	 
 }
  class ICICI implements BhimUPI{

	@Override
	public void transfer(int amt) {
		// TODO Auto-generated method stub
		System.out.println("ICICI transfers money");
	}
	  
  }
  class SBI implements BhimUPI{

		@Override
		public void transfer(int amt) {
			// TODO Auto-generated method stub
			System.out.println("SBI transfers money");
		}
		  
	  }
  class HDFC implements BhimUPI{

		@Override
		public void transfer(int amt) {
			// TODO Auto-generated method stub
			System.out.println("HDFC transfers money");
		}
		  
	  }
public class Phonepe {
public static void main(String[] args) {
	BhimUPI upi=new ICICI();
	upi.transfer(50000);
}
}
