package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[3]; //static array -- size is fixed
		//Iam Adding comments/Doing changes to check for GIT concept
		//Dynamic Array--ArrayList
		//1.can contain duplicate values/elements
		//2.Maintains insertion order
		//3. Arraylist is not synchronized 
		//4.allows random access to fetch the element because it stores the values on the basis of Indexes
		ArrayList ar = new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		System.out.println(ar.size());
		ar.add(40);//3
		ar.add(50);//4
		System.out.println(ar.size());
		ar.add(50);//5
		ar.add(12.33);
		ar.add("Test");
		ar.add('a');
		ar.add(true);
		System.out.println(ar.size()); //size of arraylist
		System.out.println(ar.get(3)); //to get the value from an index
		
		//To print all the values from arraylist
		//1.for loop
		//2.using iterator
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic vs Generic
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Selenium");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		//ar2.add(100);
		ar2.add("world");
		
		//When we are not sure about whether the input is integer or string
		ArrayList<E> ar3 = new ArrayList<E>();
		
		
		//Employee class objects
		Employee e1= new Employee("Chandra",20,"Testing");
		Employee e2= new Employee("Raja",21,"Analyst");
		Employee e3= new Employee("sekhar",22,"HR");
		
		//Create arraylist
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		//****************************To merge two arraylist, we use addall()*********************
		System.out.println("****************************To merge two arraylist, we use addall()*********************");
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Fiveone");
		ar5.add("Fivetwo");
		ar5.add("Fivethree");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("sixone");
		ar6.add("sixtwo");
		ar6.add("sixthree");
		
		ar5.addAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		//similarly Remove all()
		System.out.println("*****removeall()***********");
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		//similarly Retain all()
		System.out.println("*****retainall()***********");

		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("sevenone");
		ar7.add("seventwo");
		ar7.add("seventhree");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("seventwo");
		ar8.add("eighttwo");
		ar8.add("eightthree");
		
		ar7.retainAll(ar8);
		for(int i=0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
			
		}
	}

}
