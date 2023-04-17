package question05;

public class CTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		StringBuffer rd1 = new StringBuffer("java");
		for(int i= 0;i<10000;i++){
			rd1.append("Tpoint");
		}
		System.out.println("Time taken:" +(System.currentTimeMillis()-startTime)+ "ms");
		startTime = System.currentTimeMillis();
		StringBuilder rd2 = new StringBuilder("java");
		for (int i=0;i<10000;i++){
			rd2.append("Tpoint");
		}
		System.out.println("Time taken:" +(System.currentTimeMillis()-startTime)+ "ms");

	}

}
