
public class ArrayDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		//Array-- store the same type of data base on index value
		//syntax-- datatype arr_name[];
		int arrayInt[]= {1,2,3,4,5,6,7,0};
		int[] arrayInt1=new int[50];
		Integer[] arrayinteger=new Integer[10];
		float f[]=new float[10];
		String[] name=new String[10];
		//printing and getting
		arrayInt[7]=50;
		for(int i:arrayInt) {
			System.out.println(i);
		}
		
	}

}
