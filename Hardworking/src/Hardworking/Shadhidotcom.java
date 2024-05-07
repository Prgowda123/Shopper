package Hardworking;

public class Shadhidotcom 
	{
	static void submit() throws MarriageException
	{
		int age=15;
		if(age>=18)
		{
			System.out.println("happy life");
		}
		else {
			throw new MarriageException("child chapathi");
		}
	}
public static void main(String[] args)
{
	try {
		submit();
	}
	catch(MarriageException e)
	{
		System.out.println(e.get());
	}
}
}
class MarriageException extends Exception
{ 
	String msg;
MarriageException(String msg)
{
	this.msg=msg;
}
public String get()
{
	return msg;
}

}
