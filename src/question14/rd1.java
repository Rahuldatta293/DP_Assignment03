package question14;

import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class rd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList<String> namesList = new CopyOnWriteArrayList<String>();
		 
		//List methods are synchronized
		 
		namesList.add("rinku");
		namesList.add("sharma");
		 
		//No explicit synchronization is needed during iteration
		 
		java.util.Iterator<String> iterator = namesList.iterator(); 
		while (iterator.hasNext()) 
		{
		  System.out.println(iterator.next());
		}

	}

}
