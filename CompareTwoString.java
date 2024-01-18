import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class CompareTwoString {
    public static void main(String[] args) {

        String name ;
        String surname;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String:");
        name=sc.nextLine();
        name.toUpperCase();
        System.out.println("Enter Second String:");
        surname=sc.nextLine();
        surname.toUpperCase();
        if(name.compareTo(surname)>0)
            System.out.println("First String is Greater");
        else if(name.compareTo(surname)<0)
            System.out.println("second String is greater Than First");
        else
            System.out.println("Both are Equal");

    }
}
