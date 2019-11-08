package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
      
		LinkedList<String> ll =new LinkedList<String>();
		//add
		System.out.println("******add() method**********");
		ll.add("chandra");
		ll.add("doing");
		ll.add("Testing");
		ll.add("using");
		ll.add("selnium Java");
		
		//Printing
		System.out.println("******printing values**********");
		System.out.println("Contents of linkedlist are:"+ll);
		
		//Addfirst,AddLast
		System.out.println("******printing values along with addfirst and addlast**********");

		ll.addFirst("Hi");
		ll.addLast("Excellent");
		System.out.println("Contents of linkedlist along with addfirst and addlast are:"+ll);

		//get and set values
		System.out.println("element in the o index is: "+ll.get(0));
		
		ll.set(0, "Hello");
		System.out.println("element in the o index after set is: "+ll.get(0));
		System.out.println("Contents of linkedlist along After set method is:"+ll);
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of linkedlist After remove first-last is:"+ll);
		//remove
		ll.remove(2);
		System.out.println("Contents of linkedlist After remove second index is:"+ll);
		//How to print all values of linkedlist
		//1.for loop
		//2.advance for loop
		//3.iterator
		//4.while loop
		System.out.println("*********print linkedlist using for loop*****");
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		System.out.println("*********print linkedlist using advance for loop*****");
		for(String str:ll) {
			System.out.println(str);
		}
		System.out.println("*********print linkedlist using iterator*****");
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("*********print linkedlist using while loop*****");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
							}

}
