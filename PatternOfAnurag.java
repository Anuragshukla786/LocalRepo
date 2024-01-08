public class PatternOfAnurag {
    public static void main(String[] args) {
        int n = 8;
        // Pattern of Anurag
        for (int i = 0; i < n; i++) {
            // Pattern of A
            for (int j = 0; j < n; j++) {

                if (i == 0 && j > 0 && j < (n - 1) / 2 || j == 0 && i > 0 || i == (n - 1) / 2 && j <= (n - 1) / 2
                        || j == (n - 1) / 2 && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Pattern of N
            System.out.print("");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j || j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Pattern of U
            System.out.print("    ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1) / 2
                        || j == (n - 1) / 2 && i < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Pattern of R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j > 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) / 2
                        || i == (n - 1) / 2 && j < (n - 1) || i >= (n - 1) / 2 && i - j == 2)

                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Pattern of A
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) / 2 || j == 0 && i > 0 || i == (n - 1) / 2 && j <= (n - 1) / 2
                        || j == (n - 1) / 2 && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Pattern Of G
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 || j == 0 && i > 0 && i < (n - 1) || i == (n - 1) && j > 0
                        || j == (n - 1) && i >= (n - 1) / 2 || i == (n - 1) / 2 && j > (n - 1) / 2)

                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
