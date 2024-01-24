public class Pattern27 {
    public static void main(String[] args) {

        int n=11;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i>=j-1&&i+j>=(n-2))&&i>=(n-1)/2&&i<(n-2)||j>=(n-1)/2-1&&j<=(n-1)/2+1&&i!=0
                        ||(i+j>=(n-1)/2&&j-i<=(n-1)/2)&&i<=(n-2)/2)

                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
