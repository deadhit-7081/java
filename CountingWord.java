import java.util.*;
public class CountingWord
{
	int f = 0;
	public void getfreq(String str,String word)
	{
		for(String s : str.split(" "))
		{
			if(s.equalsIgnoreCase(word)==true)
			{
				f+=1;
			}
		}
		System.out.println("The fequency of '"+word+"' is "+f);
	}
	public static void main(String[] args)
	{
		CountingWord obj = new CountingWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		System.out.println("Enter a Word : ");
		String word = sc.next();
		obj.getfreq(str,word);
		sc.close();
	}
}
