package hashmap;

import java.util.HashMap;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> employees = new HashMap<>();
		employees.put(1234, "Priya");
		employees.put(3451, "Divya");
		employees.put(2376, "Ravi");
		employees.put(4879, "Deepak");
		employees.put(5674, "Ram");

		
		  employees.keySet().forEach(k->{ 
		      if(k%2!=0) {
		              System.out.println(k+" "+employees.get(k)); 
		        } 
		      });//key only
		      
		  
		    /*employees.forEach((k,v)->{
		          if(k%2==0) { 
		                 System.out.println(k+" "+v); 
		           } 
		    });*/
		   // key,values
		    
		    

		for (Integer k : employees.keySet()) {
			if (k % 2 == 0) {
				System.out.println(k + " " + employees.get(k));

			}
		}
		
		 /* System.out.println(employees.keySet());
		    System.out.println(employees.values());
		    System.out.println(employees.remove(1234));
		    
		    employees.forEach((k,v)->System.out.println(k+" "+v)); 
		    for(String v:employees.values()) { 
		            System.out.println(v); 
		     }*/
		 
		// System.out.println(employees.get(1234));

	}

}
