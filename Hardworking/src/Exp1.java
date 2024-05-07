
public class Exp1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("main starts");
		int []arr= {10,20,30};
		try {
			System.out.println(arr[8]);
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("handles");
		}
	System.out.println("main ends");


	}

}
