import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutPutStream {
	public static void main(String args[]){    
        try{ 
        	String s="Hello java";
        	byte b[]=s.getBytes();
          OutputStream os=new FileOutputStream("C:\\Users\\LEKHANA\\eclipse-workspace\\Assignment1\\src\\FileOutputStream\\testout.txt");    
          for(byte read:b) {
        	  os.write(read);
          }
             
          os.close();    
          System.out.println("success...");  
          InputStream is=new FileInputStream("C:\\Users\\LEKHANA\\eclipse-workspace\\Assignment1\\src\\FileOutputStream\\testout.txt");
          int size=is.available();
          for(int i=0;i<size;i++) {
        	  System.out.println((char)is.read());
          }
          is.close();
          
         }catch(Exception e)
        {
        	 System.out.println(e.getMessage());
        	 }    
        }
   }    

