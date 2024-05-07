import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector l1=new Vector();
		l1.add(10);
		l1.add(1.80);
		l1.add("hi");
		l1.add(true);
		l1.add(null);
		l1.add('a');
		System.out.println(l1);
		System.out.println(l1.capacity());

	}

}
