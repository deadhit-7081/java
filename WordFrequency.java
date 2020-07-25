
import java.util.*;
public class WordFrequency
{
	private ArrayList<String> mywords;
	private ArrayList<Integer> myfreq;
	//constructor
	public WordFrequency()
	{
		mywords = new ArrayList<String>();
		myfreq = new ArrayList<Integer>();
	}
	public void findUnique(String str)
	{
		for(String val : str.split(" "))
		{
			val = val.toLowerCase();
			int index = mywords.indexOf(val);
			if(index==-1)
			{
				mywords.add(val);
				myfreq.add(1);
			}
			else
			{
				int value = myfreq.get(index);
				myfreq.set(index,value+1);
			}
		}
		
		for(int k=0;k<mywords.size();k++)
		{
			System.out.println(myfreq.get(k)+"\t"+mywords.get(k));
		}
	}
	public static void main(String[] args) 
	{
		WordFrequency obj = new WordFrequency();
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		obj.findUnique(str);
		sc.close();
	}
}
