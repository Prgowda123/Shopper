package Hardworking;

import java.util.ArrayList;

public class retain {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		
		ArrayList l2=new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(100);
		l2.add(10);
		l1.retainAll(l2);
		
		System.out.println(l1);

	}

}
