package aris_day8;
/**
 * Functional Interface
 */
interface Evenodd {
	void check(int a);
}

public class EvenOdd {
	public static void main(String[] args) {
		// Lambda Expression
		Evenodd evenOdd = (int a) -> {
			if(a%2==0){
				System.out.println("Number "+a+" is even.");
			}else{
				System.out.println("Number "+a+" is odd.");
			}
		};
		
		//Check numbers
		evenOdd.check(5);
		evenOdd.check(8);
	}
}
/*import java.util.Arrays;
import java.util.List;

public class EvenOdd {

	public static void main(String[] args) {
		Integer[] tihNumbers = {11,12,22,15,86,55,33,64};
		List<Integer> numberList = Arrays.asList(tihNumbers);

		numberList.stream().filter(n -> n%2!=0).forEach(System.out::println);
		
	}

}*/
