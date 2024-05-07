import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		ArrayList l1 =new ArrayList();
		l1.add("mandya");
		l1.add("ramanagara");
		l1.add("mysore");
		l1.add("tumkur");
		l1.add("bengaluru");
		
System.out.println(l1);
l1.remove("mysore");
System.out.println(l1);
l1.remove(3);
System.out.println(l1);

	}

}
