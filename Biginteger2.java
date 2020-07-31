import java.util.*;
import java.math.BigInteger;
public class Biginteger2 
{
	 public static void main(String[] args) throws IOException
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String str[] = new String[n];
	        for(int i=0;i<n;i++)
	        {
	            str[i] = sc.next();
	        }
	        char ch[] = new char[n];
	        for(int i=0;i<n;i++)
	        {
	            if(i>=n/2)
	            {
	                ch[i] = str[i].charAt(str[i].length()-1);
	            }
	            else{
	                ch[i] = str[i].charAt(0);
	            }
	        }
	        String newstr = new String(ch);
	        BigInteger sum = BigInteger.ZERO;
	        sum = sum.add(new BigInteger(newstr));
	        BigInteger ele = new BigInteger("11");
	        BigInteger zero = new BigInteger("0");
	        BigInteger res = sum.mod(ele);
	        int comp = res.compareTo(zero);
	        if(comp==0)
	        {
	            System.out.println("OUI");
	        }
	        else
	        {
	            System.out.println("NON");
	        }
	    }
}
