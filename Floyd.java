import java.util.Scanner;

public class Floyd {
    public static void main(String[] args) {
        int n;
        int num=1;
        System.out.println("Enter the no of rows floyd's triangle you want:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Floyd's triangle is:");
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
