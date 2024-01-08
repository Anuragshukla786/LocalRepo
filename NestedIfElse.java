import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        int marksObtained;
        int passingMarks=40;
        char grade;

        Scanner sc=new Scanner(System.in);

        System.out.println("Input marks scored By You:");
        marksObtained=sc.nextInt();
        if(marksObtained>=passingMarks)
        {
         if(marksObtained>=90)
                grade='A';
           else if(marksObtained>=75)
                grade='B';

             else if(marksObtained>=60)
                grade='C';

             else
                grade='D';
            System.out.println("You Passe in the exam And your Grade is:"+grade);
        }
        else{
            grade='F';
           System.out.println("You Failed in a exam and your grade is:"+grade); 
        }
        sc.close();

    }
    
}
