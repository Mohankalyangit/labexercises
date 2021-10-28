package secondlab;

public class StringTest {
	String str = new String();

	public StringTest(String str) {
		super();
		this.str = str;
	}

	public void stringPositive()
	{
		
		int i=0;
		int flag=1;
		//System.out.println(str.length());
		int len = str.length();
		//char[] s = str.toCharArray();
		//String str = new String();
		while(i<len - 1)
		{
			//System.out.println("INSIDE LOOP");
				if(str.charAt(i)>str.charAt(i+1)){
					flag = 0;
					break;
				}
			
			//System.out.println(i);
			i = i + 1;
		}
		if(flag == 1)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}

}

