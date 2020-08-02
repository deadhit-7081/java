import java.util.*;
public class SortInbuild
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int a = sc.nextInt();
			arr.add(a);
		}
		Collections.sort(arr);
		System.out.println("Sorted Array ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr.get(i)+" ");
		}
	}
}
