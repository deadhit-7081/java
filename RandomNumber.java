import java.util.*;
public class RandomNumber 
{
	public void stimulate(int rolls)
	{
		Random rand = new Random();
		int counts[] = new int[13];
		for(int k=0;k<rolls;k++)
		{
			int d1 = rand.nextInt(6)+1;
			int d2 = rand.nextInt(6)+1;
			counts[d1+d2]+=1;
		}
		for(int k=2;k<=12;k++)
		{
			System.out.println(k+"s\t"+counts[k]);
		}
	}
	public static void main(String[] args) {
		RandomNumber obj = new RandomNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rolls : ");
		int n = sc.nextInt();
		obj.stimulate(n);
	}
}
