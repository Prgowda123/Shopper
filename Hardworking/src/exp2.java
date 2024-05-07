
public class exp2 {

	public static void main(String[] args) {
		
				System.out.println("main starts");
				exp2 e1=new exp2();
				      e1=null;
				try {
					System.out.println(e1.hashCode());
				} catch (NullPointerException e) 
				{
					System.out.println("handles");
				}
			System.out.println("main ends");

	}

}
