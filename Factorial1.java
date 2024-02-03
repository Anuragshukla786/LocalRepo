//Factorial of given number
import java.util.*;
public class Factorial1 {
    public static void main(String[] args)
    {
        int n,i, fact = 1;
        System.out.println("Enter the Value Of a Factorial:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n< 0)
            System.out.println("Number should be non Negative");
        else
        {
            for( i=1;i<=n;i++) {
                fact = fact * i;
                //System.out.println("Factorial of " + n + "is" + fact);
            }
            System.out.println("Factorial of "+n+"is"+fact);
        }
    }
}