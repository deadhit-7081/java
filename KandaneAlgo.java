package Arrays;
import java.util.*;
public class KandaneAlgo
{
	public static int solution(int arr[])
	{
		int csum = arr[0];
		int osum = arr[0];
		int si=0,ei=0;
		for(int i=1;i<arr.length;i++)
		{
			if(csum>=0)
			{
				csum+=arr[i];
				ei=i;
			}
			else
			{
				csum = arr[i];
				si=i;
			}
			if(csum>osum)
			{
				osum=csum;
			}
		}
		for(int i=si;i<ei;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return osum;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));
		sc.close();
	}
}
