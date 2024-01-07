import java.util.Scanner;
public class Swapping1 {
    public static void main(String[] args) {
        int x, y, temp;
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter x and y:");
        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("Before Swapping\nx ="+ x +"\ny="+y);

        temp=x;
        x=y;
        y=temp;

         System.out.println("After Swapping\nx ="+ x +"\ny="+y);
        sc.close();
    }
    
}
