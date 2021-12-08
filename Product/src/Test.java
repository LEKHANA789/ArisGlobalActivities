import java.util.*;

 class Test {
 public static void main(String[] args) {
	 System.out.println("Enter the string");
	 Scanner sc=new Scanner(System.in);
	 java.lang.String str=sc.next();
	 
	 int n=5;
	 int lastchar=str.length()-5;
	 for(int i=lastchar;i<str.length();i++) {
		 System.out.println(str.charAt(i));
	 }
	 
	
}
		
	

}
