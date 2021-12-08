import java.util.Scanner;

public class ReadArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array: ");	
	int n=sc.nextInt();
	double arr[]=new double[n];
	System.out.println("Enter array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextDouble();
		}
	System.out.println("user entered elements are ");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
sc.close();
}
}
