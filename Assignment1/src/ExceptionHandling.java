import java.util.Scanner;

class NegativeNumberNotAllowedException  extends Throwable{

	public NegativeNumberNotAllowedException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NegativeNumberNotAllowedException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
}

	
public class ExceptionHandling {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	if(n>0) 
	{
		System.out.println(n);
}
	else {
		try {
			throw new NegativeNumberNotAllowedException("negative number");
		}catch(NegativeNumberNotAllowedException ne) {
			ne.printStackTrace();
		}
		sc.close();
	}
	//sc.close();
}
}
