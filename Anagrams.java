import java.util.*;
public class Anagrams 
{
	public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int s=0;
            String a = sc.next();
            String b = sc.next();
            int arra[] = new int[26];
            int arrb[] = new int[26];
            int arrc[] = new int[26];
            for(int j=0;j<a.length();j++)
            {
                int asciia = a.charAt(j);
                arra[asciia-97] = arra[asciia-97]+1;
            }
            for(int j=0;j<b.length();j++)
            {
                int asciib = b.charAt(j);
                arrb[asciib-97] = arrb[asciib-97]+1;
            }
            for(int j=0;j<26;j++)
            {
                arrc[j] = arra[j] - arrb[j];
            }
            for(int j=0;j<26;j++)
            {
                s = s+Math.abs(arrc[j]);
            }
            System.out.println(s);
        }
    }
}
