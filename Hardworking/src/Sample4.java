
public class Sample4
{
static void disp(int[]abb)
{
	int sum=0;
	for(int i=0;i<abb.length; i++)
	{
		if(abb[i]%2==0)
		{
			sum=sum+abb[i];
		}
	}
	System.out.println(sum);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int[]arr= {10,20,30};
disp(arr);
	}
}

