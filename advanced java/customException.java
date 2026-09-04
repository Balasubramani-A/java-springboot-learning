class myException extends Exception
{
	public myException(String string)
	{
		super(string);
	}
}
public class customException {
    public static void main(String[] args) {
    	
    	int i=20;
    	int j=0;
 
    	
    	try
    	{
    		j=18/i;
    		if(j==0)
//    			throw new Exception("I don't want to do print zero");
    			throw new myException("I don't want to do print zero");
    	}

    	
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}