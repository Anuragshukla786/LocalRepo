import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String s1;
        String s2="";

        Scanner sc=new Scanner(System.in);
        System.out.println("Name of Palindrome Of String:");
        s1=sc.nextLine();

        for (int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2))
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
}
