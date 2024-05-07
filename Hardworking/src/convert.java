
public class convert {
	public static void main(String[] args) 
{
	String s1="elf2022abc18";
	String a=s1.substring(3,7);
	String b=s1.substring(10);
	int c=Integer.parseInt(a);
	int d=Integer.parseInt(b);
	int e=c+d;
System.out.println(e);
}
}