import java.util.*;
public class EraseMax {
	public static void main(String[] args) 
	{
		int max = 0,k=0,j=0,c=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==max)
			{
				c+=1;
				if(c==3)
				{
					j=i;
				}
				else
				{
					k=i;
				}
			}
		}
		//System.out.println("MAX "+max);
		//System.out.println("J "+j);
		//System.out.println("K "+k);
		if(j==0)
		{
			for(int i=k+1;i<n;i++)
			{
				arr[i-1] = arr[i];
			}
		}
		else
		{
			for(int i=j+1;i<n;i++)
			{
				arr[i-1]=arr[i];
			}
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
