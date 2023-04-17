package question12;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k =55;
		try{
		System.out.println("try block ");
		int x = k/55;
		}
		catch (ArithmeticException	e){
		System.out.println("in catch block");
		}
		finally(){
		System.out.println("Executes");
		}

	}

}
