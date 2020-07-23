/*
*################*
**##############**
***############***
****##########****
*****########*****
******######******
*******####*******
********##********
******************

*##*
****

*########*
**######**
***####***
****##****
**********
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            for(int j=1;j<=a;j++)
            {
                for(int k=1;k<=a*2;k++)
                {
                    if(k<=j || k>a*2-j)
                    {
                        System.out.print("*");
                    } 
                    else
                    {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
            System.out.println();
            
        }
    }
}
