package question16;

public class Set1 {
	
	String key;
	  void Key1(String key)
	  {
	    this.key = key;
	  }
	  
	  @Override
	  public int hashCode() 
	  {
	     return (int)key.charAt(0);
	  }

	  @Override
	  public boolean equals(Object obj)
	  {
	    return key.equals((String)obj);
	  }

}
