package pp1;

	class MyException extends Exception 
	{ 
	    public MyException(String s) 
	    { 
	        super(s); 
	    } 
	} 


	public class TryAndCatch {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try
	        { 
	            throw new MyException("temp"); 
	        } 
	        catch (MyException ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 


		}

