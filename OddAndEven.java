import java.util.*;
public class OddAndEven {
    public static void main(String[] args) {
        int num1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an integer if you Check it is even or odd");
        num1=sc.nextInt();

        if(num1%2==0)
        {
            System.out.println("Your Entered number is Even ");
            
        }
        else{

        
        System.out.println("Your Entered Number is Odd");
        }
        sc.close();
    }
    
}
