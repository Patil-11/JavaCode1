package com.CollectorClass;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Set;
import java.util.Comparator;
import java.util.Optional;





public class CollectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> li = new ArrayList<Product>();  
        //Adding Products  
        li.add(new Product(101,"BMW",2000,25000f));  
        li.add(new Product(102,"Ford",4000,30000f));  
        li.add(new Product(103,"Volksvagen",7000,28000f));  
        li.add(new Product(104,"Hyundai",5000,28000f));  
        li.add(new Product(105,"Toyota",3000,90000f));  
        System.out.println("List of Cars"+li);
        
        
       
        //.toList()
         List<Float> productPriceList =   
                            li.stream().map(x->x.price)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println("Car Price List:"+productPriceList);  
        
        
        List<String> hlist =   
                            li.stream().map(x->x.name)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println("Car Name :"+hlist);  
        
        
        //.toSet()
        Set < Double > powerprice =
                            li.stream().map(x -> x.power) // fetching price  
                            .collect(Collectors.toSet()); // collecting as list  
            System.out.println("Car Power Price :"+powerprice );
            
            
       Set < Float > carprice =
                    li.stream()
                    .map(x -> x.price) // fetching price  
                    .collect(Collectors.toSet()); // collecting as list  
                System.out.println("Car Price :"+carprice );
                
           
       /* Optional<Product> maxElement = li.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Product::getprice))); // collecting as list  
                 System.out.println("Maximum Price :" +maxElement );*/
                    
       //sum()
            Double sumPrices =   
                    li.stream()  
                    .collect(Collectors.summingDouble(x->x.price));  // collecting as list  
            System.out.println("Sum of prices: "+sumPrices);  
            
            Integer sumId =   
                    li.stream().collect(Collectors.summingInt(x->x.id));  
            System.out.println("Sum of id's: "+sumId);  
            
        //Average()
            Double average = li.stream()  
                    .collect(Collectors.averagingDouble(p->p.price));  
            System.out.println("Average price is: "+average);  
   
   		//Counting()
            Long noOfElements = li.stream()
           .collect(Collectors.counting());
            System.out.println("Total elements : " + noOfElements);
	}
}

