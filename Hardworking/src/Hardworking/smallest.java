package Hardworking;

public class smallest {

	public static void main(String[] args) {
		int[]arr= {1,3,8,9,7};
		int smallest=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{ 
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}

}
