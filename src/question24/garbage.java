package question24;

import java.util.ArrayList;
import java.util.List;

public class garbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime run = Runtime.getRuntime();
		for(int i=0;i<=10000;i++) {
		List<Integer> lst  = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		}
		System.out.println("Memory before:" + run.freeMemory());
		System.gc();
		System.out.println("Memory after:" + run.freeMemory());

	}

}
