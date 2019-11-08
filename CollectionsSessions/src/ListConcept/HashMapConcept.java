package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		//Hashmap is a class implements Map Interface
		//extends AbstractMap
		//it contains only unique elements
		//stores the values Key-value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//hashmap is non synchronized--not thread safe
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "RESTAPI");
		System.out.println("Print the 1 index value in hasmap:" +hm.get(1));
		System.out.println("Print the 4 index value in hasmap:" +hm.get(4));
		
		System.out.println("*****how to iterate hashmap*********");
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+""+ m.getValue());
		}
		//removing an object
		System.out.println("*****how to remove element in hashmap*********");
		System.out.println("Printing hashmap before removing second "+hm);
		hm.remove(2);
		System.out.println("Printing hashmap after removing second "+hm);
		
		//How to use user defined class objects in hashmap
		System.out.println("****How to use user defined class objects in hashmap******");
		HashMap<Integer,Employee> hm1 = new HashMap<Integer,Employee>();
		Employee e1= new Employee("Teja",25,"Dev");
		Employee e2= new Employee("Naga",24,"Ops");
		Employee e3= new Employee("Brahma",22,"Trainer");
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		//traverse the Hashmap
		for(Entry<Integer,Employee> m : hm1.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee "+key+"----info :");
			System.out.println(e.name+" "+e.age+" "+e.dept);
			
		}
		
		
	}

}
