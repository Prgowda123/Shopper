
public class Exp {

	public static void main(String[] args)
{
		System.out.println("main starts");
		try {
			int i=1/0;
		} catch (ArithmeticException e) 
		{
			System.out.println("handles");
		}
	System.out.println("main ends");


	}

}
