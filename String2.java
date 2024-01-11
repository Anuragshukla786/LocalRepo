import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        String s1;
        String s2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Before Reversing");
        s1=sc.nextLine();

        String arr[]=s1.split(" ");
        for(String ele:arr)
        {
            for(int i=ele.length()-1;i>=0;i--)
            {
                s2=s2+ele.charAt(i)+"";
            }
        }
        System.out.println("After Reversing:"+s2);

    }
    
}
