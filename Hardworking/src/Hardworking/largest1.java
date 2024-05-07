package Hardworking;

public class largest1 {

	public static void main(String[] args) {
		int[]arr= {1,3,8,9,7};
		int largest=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>largest)
			{ 
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

}
