package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(201,"Priya",23,"B.E",false);
		Student s2= new Student(202,"Ravi",24,"B.A",true);
		Student s3= new Student(203,"Ram",25,"B.E",true);
		Student s4= new Student(145,"Pavi",20,"B.E",false);
		Student s5= new Student(289,"Ramesh",22,"B.A",true);
		Student s6=new Student(345,"Ramya",24,"B.E",false);
		Student s7= new Student(456,"Jeffrey",21,"B.A",true);
		
		HashMap<Integer,Student>students=new HashMap<>();
		students.put(s1.getRollNo(), s1);
		students.put(s2.getRollNo(), s2);
		students.put(s3.getRollNo(), s3);
		students.put(s4.getRollNo(), s4);
		students.put(s5.getRollNo(), s5);
		students.put(s6.getRollNo(), s6);
		students.put(s7.getRollNo(), s7);
		
		Iterator<Integer> itr=students.keySet().iterator();
		while(itr.hasNext()) {
			int l=itr.next();
			if(students.get(l).getDegree().equalsIgnoreCase("B.E")) {
				System.out.println(students.get(l));
			}
		}
		
		

	}

}
