import java.util.*;
import java.math.BigInteger;
public class Biginteger 
{
	 public static void main(String args[] ) throws Exception 
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            BigInteger a = sc.nextBigInteger();
	           // System.out.println("A "+a);
	            BigInteger one =new BigInteger("1");
	            int comp = a.compareTo(one);
	            if(comp>=0)
	            {
	                System.out.println("YES");
	            }
	            else
	            {
	                System.out.println("NO");
	            }
	        }
	    }
}
