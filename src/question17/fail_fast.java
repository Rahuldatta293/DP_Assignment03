package question17;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class fail_fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> cty = new HashMap<String, String>();
		cty.put("Bhutan", "Nepal");
		cty.put("Beijing", "China");
		cty.put("Rome", "Italy");
  
        Iterator iterator = cty.keySet().iterator();
  
        while (iterator.hasNext()) {
            System.out.println(cty.get(iterator.next()));
            cty.put("Istanbul", "Turkey");
        }

	}

}
