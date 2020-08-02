import java.util.*;
public class SortInBuildString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			String str = sc.next();
			arr.add(str);
		}
		Collections.sort(arr);
		System.out.println("Sorted Array ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr.get(i)+" ");
		}
	}
}
