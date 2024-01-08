import java.util.Scanner;
import  java.math.BigInteger;

public class AddingLargeNo {
    public static void main(String[] args) {
        String number1 ,  number2;
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter First Number:");
        number1=sc.nextLine();

        System.out.println("Enter second Number:");
        number2=sc.nextLine();

        BigInteger obj1=new BigInteger(number1);
        BigInteger obj2=new BigInteger(number2);
        BigInteger sum;

        sum=obj1.add(obj2);
        System.out.println("Result of Addition is:"+sum);

        sc.close();
        
    }
    
}
