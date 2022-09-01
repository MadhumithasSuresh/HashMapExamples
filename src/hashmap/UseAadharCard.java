package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class UseAadharCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AadharCard aCard1= new AadharCard(840060386619l,"Priya",23,false,"Vellore");
		AadharCard aCard2= new AadharCard(840060383473l,"Ravi",24,true,"IGP");
		AadharCard aCard3= new AadharCard(843460386617l,"Lokesh",24,true,"Vellore");
		AadharCard aCard4= new AadharCard(790060323619l,"Pavi",23,false,"Salem");
		AadharCard aCard5= new AadharCard(840060378615l,"Keerthi",21,false,"IGP");
		AadharCard aCard6= new AadharCard(863060354613l,"Ram",18,true,"Vellore");
		AadharCard aCard7= new AadharCard(840060308619l,"Anitha",23,false,"IGP");
		AadharCard aCard8= new AadharCard(760060386612l,"Aravind",25,true,"Salem");
		AadharCard aCard9= new AadharCard(840890353619l,"Jaya",23,false,"SRP");
		AadharCard aCard10= new AadharCard(340063486619l,"Bhuvi",27,false,"Vellore");
		AadharCard aCard11= new AadharCard(840060386127l,"Surya",23,true,"SRP");
		AadharCard aCard12= new AadharCard(560023386619l,"Azeem",26,true,"Vellore");
		
		HashMap<Long,AadharCard> acards=new HashMap<>();
		acards.put(aCard1.getAadharNo(),aCard1);
		acards.put(aCard2.getAadharNo(),aCard2);
		acards.put(aCard3.getAadharNo(),aCard3);
		acards.put(aCard4.getAadharNo(),aCard4);
		acards.put(aCard5.getAadharNo(),aCard5);
		acards.put(aCard6.getAadharNo(),aCard6);
		acards.put(aCard7.getAadharNo(),aCard7);
		acards.put(aCard8.getAadharNo(),aCard8);
		acards.put(aCard9.getAadharNo(),aCard9);
		acards.put(aCard10.getAadharNo(),aCard10);
		acards.put(aCard11.getAadharNo(),aCard11);
		acards.put(aCard12.getAadharNo(),aCard12);
		
		/*Iterator<Long>itr=acards.keySet().iterator();
		while(itr.hasNext()) {
			long k =itr.next();
			if(acards.get(k).getName().startsWith("A")) {
			System.out.println(acards.get(k));
			}	
		}
		
		/*Iterator<Long>itr=acards.keySet().iterator();
		while(itr.hasNext()) {
			if(acards.get(itr.next()).getIsMale()==true) {
				itr.remove();
			}
		}
		acards.forEach((k,v)->System.out.println(k+" "+v));
		
		/*Iterator<AadharCard> itr=acards.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getIsMale()==false) {
				itr.remove();
			}
		}
		acards.forEach((k,v)->System.out.println(k+" "+v));*/
		
		
		
		for(Long a:acards.keySet()) {
			//if(acards.get(a).getAge()%2==0) {
				System.out.println(acards.get(a));
				
			//}
			
		}
	
		/*acards.keySet().forEach(k->{
			if(acards.get(k).getIsMale()==false) {
				System.out.println(acards.get(k));
			}
		});
		
		//System.out.println(acards.keySet());
		 
		 
		 /*acards.forEach((k,v)->{
			 if(v.getIsMale()==true) {
				 System.out.println(k+" "+v);
			 }
			 
		 });*/
	
		
		

	}

}
