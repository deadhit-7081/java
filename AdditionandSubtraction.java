import java.util.*;
public class AdditionandSubtraction
{
	public static void main(String[] args)
	{
		int i=0,f=0,j=0;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		HashMap<Integer,Integer> arr = new HashMap<Integer,Integer>();
		while(i<=2000)
		{
			if(i==0)
			{
				arr.put(i,0);
			}
			else if(i%2==0)
			{
				arr.put(i,arr.get(i-1)-y);
			}
			else
			{
				arr.put(i,arr.get(i-1)+x);
			}
			if(arr.get(i)==z)
			{
				f=1;
				j=i;
				break;
			}
			i++;
		}
		if(f==1){
			System.out.println(j);
		}
		else
		{
			System.out.println("-1");
		}
		sc.close();

	}
}
