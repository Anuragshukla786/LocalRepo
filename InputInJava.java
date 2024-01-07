import java.util.Scanner;
public class InputInJava {
    public static void main(String[] args) {
        
        int a;
        String b;
        double c;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a String:");
        b=sc.nextLine();
        System.out.println("Your String Is:"+b);
        
        System.out.println(" Enetr a integr:");
        a=sc.nextInt();
        System.out.println("Your Enter integer is:"+a);

        System.out.println("Enter a double number:");
        c=sc.nextDouble();
        System.out.println("Your double value is:"+c);


        

    }
    
}
