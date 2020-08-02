import java.util.*;
public class LinearSearch
{
	public void find(String arr[],String word)
	{
		int f=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase(word))
			{
				f=1;
				System.out.println("Found "+arr[i]);
			}
		}
		if(f==0)
		{
			System.out.println("Not In the array");
		}
	}
	public static void main(String[] args)
	{
		LinearSearch obj = new LinearSearch();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.next();
		}
		String word = sc.next();
		obj.find(arr, word);
		sc.close();
	}
}
