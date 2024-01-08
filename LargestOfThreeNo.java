import java.util.*;

public class LargestOfThreeNo {
    public static void main(String[] args) {

        int x,y,z;

     Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        
        if(x>y && x>z)
        {
            System.out.println("First Number is Larger");

        }
        else if(y>x && y>z)
        {
            System.out.println("Second number is Larger");

        }
        else if(z>x && z>y)
        {
            System.out.println("Third number is Larger");

        }
        else
        {
            System.out.println("Enter Number is not Distinict");
        }
        sc.close();
    }
    
}
