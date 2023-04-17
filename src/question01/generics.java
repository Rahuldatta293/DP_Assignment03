package question01;

public class generics {
	class Tree<T, U>
	{
	    T left;  
	    U right;  
	  
	   
	    Tree(T left, U right)
	    {
	        this.left = left;
	        this.right = right;
	    }
	  
	  
	    public void print()
	    {
	        System.out.println(left);
	        System.out.println(right);
	    }
	}
	
}
