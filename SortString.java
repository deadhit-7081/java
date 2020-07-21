import java.util.*;
public class SortString 
{
	public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int c=0;
            String a = sc.next();
            String b = sc.next();
            char arra[] = a.toCharArray();
            Arrays.sort(arra);
            char arrb[] = b.toCharArray();
            Arrays.sort(arrb);
            for(int j=0;j<a.length();j++)
            {
            	System.out.print(arra[j]);
            }
            System.out.println();
            for(int j=0;j<a.length();j++)
            {
            	System.out.print(arrb[j]);
            }
            System.out.println();
            if(a.length() == b.length())
            {
                for(int j=0;j<a.length();j++)
                {
                    if(arra[j] == arrb[j])
                    {
                        c+=1;
                    }
                }
            }
            else
            {
                System.out.println("NO");
            }

            if(c==a.length())
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
