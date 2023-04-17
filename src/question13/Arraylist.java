package question13;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> str = new ArrayList(); 
		 
		// Adding elements to arraylist 
		str.add("kiran"); 
		str.add("Dinesh"); 
		str.add("sohith"); 
		str.add("phani"); 
 
		// Traversing ArrayList elements
		System.out.println("engineers:"); 
		Iterator iterator = str.iterator(); 
		while (iterator.hasNext()) 
			System.out.println(iterator.next()); 

	}

}
