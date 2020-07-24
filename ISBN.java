/*
The ISBN is valid if:
1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8 + 9xdigit9 + 10xdigit10 is divisible by 11.
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            sum=sum+Character.getNumericValue(ch[i])*(i+1);
        }
        if(sum%11==0)
        {
            System.out.println("Legal ISBN");
        }
        else
        {
            System.out.println("Illegal ISBN");
        }
    }
}
