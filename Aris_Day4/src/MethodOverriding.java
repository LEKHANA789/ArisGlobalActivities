


	//we can make class final and variable as final and method as final then we canot able to override
	 class BaseClass{
		 int rollno=101;
		 void baseMethod() {
			System.out.println("base method");
		}
	}

	public class MethodOverriding extends BaseClass {
		@Override
		void baseMethod() {
			System.out.println("child class method");
		}
		

		public static void main(String[] args) {
			BaseClass overriding=new MethodOverriding();
			overriding.rollno=200;
			overriding.baseMethod();
		}
	}


