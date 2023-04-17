package question02;

public class overTree {
	
    protected void method()
    {
        System.out.println("Hello");
    }
}
 
public class q1 extends overTree {
    public void method()
    {
        System.out.println("Hello");
    }
 
    public static void main(String args[])
    {
        q1 b = new q1();
        b.method();
    }
}
