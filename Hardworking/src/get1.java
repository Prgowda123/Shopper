import java.util.ArrayList;

public class get1 {

	public static void main(String[] args) {
		ArrayList l1 =new ArrayList();
		l1.add("mandya");
		l1.add("ramanagara");
		l1.add("mysore");
		l1.add("tumkur");
		l1.add("bengaluru");
		System.out.println(l1);
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
	}

}
