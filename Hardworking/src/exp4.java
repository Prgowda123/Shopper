
public class exp4 {

	public static void main(String[] args)
	{
		
		System.out.println("main starts");
		
		try {
			int i=1/0;
		} 
		finally {
			System.out.println("hey i am finally block");
		}
		
	System.out.println("main ends");

	}

}
