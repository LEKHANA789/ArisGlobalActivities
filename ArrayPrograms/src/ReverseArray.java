import java.util.Scanner;
public class ReverseArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array: ");	
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
	System.out.println("user entered elements are ");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("array elements in reverse order");
	for(int i=arr.length-1;i>=0;i--)
		System.out.println(arr[i]);
sc.close();
}
}