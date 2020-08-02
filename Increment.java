import java.util.*;
public class Increment
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int c =0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='9')
			{
				c+=1;
			}
		}
		if(c==str.length())
		{
			System.out.println(str.length()+1);
		}
		else
		{
			System.out.println(str.length());
		}
		sc.close();
	}
}
