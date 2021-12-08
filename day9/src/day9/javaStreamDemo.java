package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	public String getName() {
		// TODO Auto-generated method stub
		return  id+name+price;
	}
	public String getPrice() {
		// TODO Auto-generated method stub
		return "[id is"+ id+" name is "+name+" price is "+price+" ]";
	}
	  
	
}  
public class javaStreamDemo {
	 public static void main(String[] args) {  
	        List<Product> productsList = new ArrayList<>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        List<Float> productPriceList = new ArrayList<Float>(); 
	        productsList.stream()  
            .filter(p ->p.price> 30000)   // filtering price  
            .map(pm ->pm.price)          // fetching price  
            .forEach(System.out::println);  // iterating price  
	         
	       
	        List<Product> productPriceList1 = productsList.stream()
	        .sorted()
	        	      .collect(Collectors.toList()
	        	       );
	        productPriceList1.forEach(System.out::println);
	        System.out.println(productPriceList1);
	        
	        
	        

	        
	        
	        
	        /*for(Product product: productsList){  
	              
	            // filtering data of list  
	            if(product.price<30000){  
	                productPriceList.add(product.price);    // adding price to a productPriceList  
	            }  
	        }  
	        System.out.println(productPriceList);   // displaying data  
	    }
	    */  
	}

	//private static void forEach(Object object) {
		// TODO Auto-generated method stub
		
	//}
//
	
}

