package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();
		h1.put(1, "Raj");
		h1.put(2, "Ravi");
		h1.put(3, "Ramu");
		
		//Create a clone copy/shallow copy
		System.out.println("***Create a clone copy/shallow copy******");
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		System.out.println("The values from h1 object are: "+h1);
		System.out.println("The values from h2 object are: "+h2);
		h1.clear();
		System.out.println("The values from h1 object after clear are: "+h1);
		System.out.println("The values from h2 object after clear are: "+h2);
		
		//Contains value:
		System.out.println("***Contains value******");
		Hashtable h3 = new Hashtable();
		h3.put("A", "Apple");
		h3.put("B", "Ball");
		h3.put("c", "Cat");
		if(h3.containsValue("Ball")) {
			System.out.println("The specified vlaue is found");
			
		//Print all the values from hash table using ---Enumeration—elements()
		System.out.println("*******Print all the values from hash table using ---Enumeration—elements()*****");
		Enumeration e = h3.elements();
		while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		}
		//get all the values from hashtable using entry set()--set of hashtable values
		System.out.println("*******Print all the values from hash table using ---entry set()--set of hashtable values*****");
		Set s = h3.entrySet();
		System.out.println(s);
		
		Hashtable h4 = new Hashtable();
		h4.put("A", "Apple");
		h4.put("B", "Ball");
		h4.put("c", "Cat");
		//Check both the hash tables are equal or not
		if(h3.equals(h4)) {
			System.out.println("Both hashtables are equal");
		}
		//get the specific value from hastable
		System.out.println("The value of hashtable is "+h4.get("A"));
		//get the hashcode of hashtable object
		System.out.println("The hashcode value of h4"+h4.hashCode());
		
		//how it displays duplicate values--just for our understanding
		System.out.println("*******how it displays duplicate values*******");

		Hashtable h5 = new Hashtable();
		h5.put("A", "red");
		h5.put("B", "blue");
		h5.put("c", "Green");
		h5.put("c", "yellow");
		h5.put("D", null);
		
		System.out.println("checking the hashtable how it displays the duplicate values:"+h5);

		
		
		}
		

		

	}

}
