

public class Car {

	void speed()
	{
		System.out.println(" car speed is 176kmph");
	}

}
 class ToyotaCar extends Car {


	void speed(int x)
	{
		System.out.println(" Toyota car speed is 177kmph");
	}

}
 class NanoCar extends Car {

		void speed(int x, int y)
		{
			System.out.println(" nano car speed is 180kmph");
		}

	}
 class Hyundai extends Car {

		void speed(double z)
		{
			System.out.println(" hyundai car speed is 160kmph"+z);
		}
		public static void main(String[] args) {
			Hyundai obj=new Hyundai();
			obj.speed(2.0);
		}

	}
 


