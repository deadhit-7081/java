import java.util.*;
public class SelectionSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			int min = i;
			int minj=i+1;
			for(int j=i+2;j<n;j++)
			{
				if(arr[j]<arr[minj])
				{
					minj = j;
				}
			}
			if(arr[minj]<arr[min])
			{
				int t=arr[i];
				arr[i] = arr[minj];
				arr[minj] = t;
			}
			else
			{
				continue;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
