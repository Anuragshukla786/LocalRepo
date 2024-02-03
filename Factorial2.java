import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {

        int num = 0;
        long factorial=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the Input of Number:");
        num=sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {

            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
