import java.util.*;
public class BinarySearch
{
	public void find(String str[],String word)
	{
		int l=0,h = str.length,mid=0,f=0;
		while(l<=h)
		{
			mid = (l+h)/2;
			if(str[mid].equalsIgnoreCase(word))
			{
				f=1;
				System.out.println("Found "+str[mid]);
				break;
			}
			else if(word.compareTo(str[mid])>0)
			{
				l = mid+1;
			}
			else
			{
				h = mid-1;
			}
		}
		if(f==0)
		{
			System.out.println("Not in Array");
		}
	}
	public static void main(String[] args)
	{
		BinarySearch obj = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i=0;i<n;i++)
		{
			str[i] = sc.next();
		}
		String word = sc.next();
		obj.find(str, word);
		sc.close();
	}
}
