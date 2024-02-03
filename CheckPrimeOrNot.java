import java.util.Scanner;
public class CheckPrimeOrNot {
    public static void main(String[] args) {
        int num = 0;
        boolean  flag= false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the input of number");
        num=sc.nextInt();
        for(int i=2;i<=num/2;++i)
        {
            if(num%i==0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("It is Prime Number");
        else
            System.out.println("It is not prime");
    }
}
