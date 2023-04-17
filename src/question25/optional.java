package question25;

import java.util.Optional;

public class optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] omg = new String[10];
		Optional<String>checkNull = Optional.ofNullable(omg[7]);
		if (checkNull.isPresent()){
		String word = omg[7].toLowerCase();
		System.out.println(omg);
		}else {
		System.out.println("String is null");
	
			}

	}

}
