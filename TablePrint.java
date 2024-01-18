import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The print Multiplication of table");
        n=sc.nextInt();
        System.out.println("Value of table is"+n);
        for(int i=0;i<=10;i++)
            System.out.println(n +"*"+i+"="+n*i);
    }
}
