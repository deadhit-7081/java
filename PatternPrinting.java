/*
4
*   *
*   *
*****
*   *
*   *
*****
*   *
*   *
*****
*   *
*   *
*****
*   *
*   *
*/

import java.util.*;
public class PatternPrinting 
{
	public static void main(String args[] ) throws Exception 
    {
        int i=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=1;i<(n*3)+3;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i%3==0)
                {
                    System.out.print("*");
                }
                else if(j==0 || j==4)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
