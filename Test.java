package labnine;

	class Test
	{
	    public static void main(String args[])
	    {
	        // lambda expression to implement above
	        // functional interface
	        FuncInterface fobj = (a,b) -> System.out.println(Math.pow(a, b)); 
	        fobj.Func(5,2);
	  
	    }
	}

