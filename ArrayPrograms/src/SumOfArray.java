import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the array length");
int n=sc.nextInt();
//creation of array
int arr[]=new int[n];
//read array elements
System.out.println("enter array elements");
for(int i=0;i<arr.length;i++)
	arr[i]=sc.nextInt();
System.out.println("user entered elements are");
for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
int sum=0;
for(int i=0;i<arr.length;i++)
	sum=sum+arr[i];
System.out.println(sum);
sc.close();
}
	

}
