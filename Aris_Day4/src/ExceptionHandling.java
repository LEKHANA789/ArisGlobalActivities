
public class ExceptionHandling {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}catch(ArithmeticException e) {
		System.out.println("divide by zero is not allowed");
	}catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("divide by zero is not allowed");
	}
		finally {
			System.out.println("i am always execute");
		}
		
	}
		//or we can throw exception 
		
	}


