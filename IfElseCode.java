import java.util.*;
public class IfElseCode {
    public static void main(String[] args) {
        int marksObtained;
        int passingMarks=40;

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Input marks scored by You:");
         marksObtained=sc.nextInt();

        if (marksObtained>=passingMarks) {
            System.out.println("You passes the exam");
        }
        else
        {
            System.out.println("Unfortunatily you are failed in exam");
        }
        sc.close();
    }
    
}
