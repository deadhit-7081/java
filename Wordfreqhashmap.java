import java.util.*;
public class Wordfreqhashmap 
{
	private HashMap<String,Integer> wordfreq;
	public Wordfreqhashmap()
	{
		wordfreq = new HashMap<String,Integer>();
	}
	public void getfreq(String str)
	{
		for(String s:str.split(" "))
		{
			s = s.toLowerCase();
			if(!wordfreq.containsKey(s))
			{
				wordfreq.put(s, 1);
			}
			else
			{
				wordfreq.put(s,wordfreq.get(s)+1);
			}
		}
		for(String s : wordfreq.keySet())
		{
			System.out.println(wordfreq.get(s)+"\t"+s);
		}
	}
	public static void main(String[] args) 
	{
		Wordfreqhashmap obj = new Wordfreqhashmap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		obj.getfreq(str);
		sc.close();
	}
}
