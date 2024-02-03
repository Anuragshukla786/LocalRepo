public class Reverse {
    public static String reverseString(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        String s1="Anurag Shukla";
        String s2=reverseString(s1);

        System.out.println("Original string is :"+s1);
        System.out.println("reverse :"+s2);


    }
}
