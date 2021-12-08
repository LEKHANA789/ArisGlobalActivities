package aris_day8;
interface parser {  
    String parse(String str);  
}  
class StringParser {  
    public static String convert(String str) {  
        if (str.length() <= 3) {  
            str = str.toUpperCase();  
        } else {  
            str = str.toLowerCase();  
        }  
        return str;  
    }  
}  
class MyPrinter {  
    public void print(String str, parser p) {  
        str = p.parse(str);  
        System.out.println(str);  
    }  
}  
public class MyFunctionalInterface {  
    public static void main(String[] args) {  
        String str = "Aman Gupta";  
        MyPrinter mp = new MyPrinter();  
        // Using Anonymous Class  
        mp.print(str, new parser() {  
            public String parse(String str) {  
                return StringParser.convert(str);  
            }  
        });  
    }  
} 
/*//Interface  
interface parser {  
  String parse(String str);  
}  
class StringParser {  
  public static String convert(String str) {  
      if (str.length() <= 3) {  
          str = str.toUpperCase();  
      } else {  
          str = str.toLowerCase();  
      }  
      return str;  
  }  
}  
class MyPrinter {  
  public void print(String str, parser p) {  
      str = p.parse(str);  
      System.out.println(str);  
  }  
}  
public class MyFunctionalInterface {  
  public static void main(String[] args) {  
      String str = "Aman Gupta";  
      MyPrinter mp = new MyPrinter();  
      // using Lambda Expressions  
      mp.print(str, (s) -- > StringParser.convert(str));  
  }  
}
	

}*/
