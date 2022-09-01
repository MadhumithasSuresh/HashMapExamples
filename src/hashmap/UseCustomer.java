package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer(12345,"Priya",50000,12765657679906l,"SBIN00043");
		Customer c2=new Customer(65746,"Pavi",45000,567465657679906l,"AXB00043");
		Customer c3=new Customer(75345,"Ram",578000,98765657679906l,"SBIN00673");
		Customer c4=new Customer(89745,"Ravi",78900,54635657679906l,"AXN06743");
		Customer c5=new Customer(76846,"Geetha",54500,32455657679906l,"SBIN00043");
		Customer c6=new Customer(56495,"Raja",98700,45485657679906l,"SBIN000876");
		Customer c7=new Customer(75034,"Srinisha",502340,1276556679906l,"SBIN078655");
		Customer c8=new Customer(23455,"Sam",567400,12767896679906l,"CNBN00043");
		Customer c9=new Customer(78652,"Ramya",435600,3458657679906l,"CIBN00043");
		Customer c10=new Customer(657348,"riya",50000,1234567679906l,"SBIN00043");
		Customer c11=new Customer(76145,"Jaya",67800,12765678649006l,"IOB00043");
		Customer c12=new Customer(156740,"Preetha",45600,1276523479906l,"CNB00043");
		Customer c13=new Customer(987345,"Aarthi",900000,145684679906l,"AXB678043");
		Customer c14=new Customer(167545,"Ezhil",453000,16754679906l,"CNB70043");
		
		HashMap<Integer,Customer> customers=new HashMap<>();
		customers.put(c1.getCustomerId(),c1);
		customers.put(c2.getCustomerId(),c2);
		customers.put(c3.getCustomerId(),c3);
		customers.put(c4.getCustomerId(),c4);
		customers.put(c5.getCustomerId(),c5);
		customers.put(c6.getCustomerId(),c6);
		customers.put(c7.getCustomerId(),c7);
		customers.put(c8.getCustomerId(),c8);
		customers.put(c9.getCustomerId(),c9);
		customers.put(c10.getCustomerId(),c10);
		customers.put(c11.getCustomerId(),c11);
		customers.put(c12.getCustomerId(),c12);
		customers.put(c13.getCustomerId(),c13);
		customers.put(c14.getCustomerId(),c14);
		
		/*customers.keySet().forEach(k->{
			if(customers.get(k).getCustomerId()%2==0) {
				System.out.println(customers.get(k));
			}
		});*/
		Iterator<Integer> itr=customers.keySet().iterator();
		
		while(itr.hasNext()) {
			int k =itr.next();
			if(customers.get(k).getName().endsWith("i")) {
			System.out.println(customers.get(k));
		}
		}
		
		
		

	}

}
