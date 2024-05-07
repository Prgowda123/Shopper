
public class merge {

	public static void main(String[] args) {
		int[]arr= {10,20,30};
		int[]abb= {10,20,40};
		int size=arr.length+abb.length;
		int[]acc=new int[size];
		int pos=0;
		for(int i:arr)
		{
		acc[pos]=i;
		pos++;
		}
		for(int j:abb)
		{
		acc[pos]=j;
		pos++;
		}
		for(int k=0;k<acc.length;k++)
		{
		for(int l=k+1;l<acc.length;l++)
		{
			if(acc[k]==acc[l])
			{
				acc[l]=0;
			}
		}
		}
for(int a1:acc)
{
	if(a1!=0)
	{
		System.out.println(a1);
	}
}
	}

}
