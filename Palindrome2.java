public class Palindrome2 {
    public static void main(String[] args) {
        String s1="MAdAM";
        String s2="";
        s1=s1.toUpperCase();

        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2))
        {
            System.out.println("it is Palindrom");
        }
        else
        {
            System.out.println("it is not palindrome");
        }

    }
}
