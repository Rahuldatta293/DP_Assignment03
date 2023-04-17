package question15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> dtable=new Hashtable<Integer,String>();
		dtable.put(10,"rahul");
		dtable.put(11,"datta");
		dtable.put(12,"bitra");
		dtable.put(13,"sasi");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:dtable.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
 
	}
}

    
