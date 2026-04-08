package patterns;
import java.util.Scanner;
//methods of all patterns
class Pat
{

    void square(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void leftTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void invertedLeftTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void rightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void invertedRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void invertedPyramid(int n) {
        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 1; k <= 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void diamond(int n) {
        //pyramid
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < n; i++) {

            //Inverted pyramid
            //spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 1; k <= 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void hollowSquare(int n) {
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    void hollowTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++)
            {
                if (i == 0 || i == n - 1 || k == 0 || k == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("*");
            System.out.println();
        }
    }

    void hollowPyramid(int n)
    {
        for (int i = 0; i < n; i++)
        {
            //spaces
            for (int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            //pyramid
            for (int k = 0; k <2*i+1; k++)
            {
                if (i == 0 || i == n - 1 || k == 0 || k == 2*i)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }

            System.out.println();
        }
    }

    void floydTriangle(int n)
    {
        int num = 1;
        for (int i = 0; i < n; i++)
        {

            for (int j  =0 ; j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
    }

    void numberTriangle(int n)
    {

        for (int i = 0; i < n; i++)
        {
            int num = 1;
            for (int j  =0 ; j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
    }

    void reverseNumberTriangle(int n)
    {

        for (int i = 0; i < n; i++)
        {
            int num = 1;
            for (int j  =0 ; j<n-i;j++)
            {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
    }

    void repeatedNumberTriangle(int n)
    {
        int num = 1;
        for (int i = 0; i < n; i++)
        {

            for (int j  =0 ; j<=i;j++)
            {
                System.out.print(num+" ");

            }
            num++;
            System.out.println();
        }
    }

    void alphabetTriangle(int n)
    {
        for (int i = 0; i < n; i++)
        {
            char ch = 'A';
            for (int j  =0 ; j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }

            System.out.println();
        }
    }

    void sameAlphabetPattern(int n)
    {
        char ch = 'A';
        for (int i = 0; i < n; i++)
        {

            for (int j  =0 ; j<=i;j++)
            {
                System.out.print(ch+" ");

            }
            ch++;
            System.out.println();
        }
    }

    void reverseAlphabetPattern(int n)
    {

        for (int i = 0; i < n; i++)
        {
            char ch = 'A';
            for (int j  =0 ; j<n-i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }

            System.out.println();
        }
    }

    void binaryPattern(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }

    void butterflyPattern(int n)
    {
        for (int i = 0; i <n; i++)
        {
            //upper part
            for (int j = 0; j <=i ; j++)
            {
                System.out.print("*");
            }
            for (int k = 1; k < 2 * n - (2 * i + 1); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part

        for (int i = 0; i <n; i++)
        {
            //upper part
            for (int j = 0; j <n-i ; j++)
            {
                System.out.print("*");
            }
            for (int k = 1; k < (2 * i + 1); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <n-i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pascalTriangle(int n)
    {
        for (int i = 0; i < n; i++)
        {
            int num = 1;

            for (int j = 0; j <= i; j++)
            {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    void sandglassPattern(int n)
    {
        //upper part
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*(n-i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    void crossPattern(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {

                if (j == i || j==n-i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
    }

    void zigzagPattern(int n)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j <n; j++) {

                if ((i + j) % 4 == 0 || (i == 1 && j % 4 == 2))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pat p = new Pat();

        System.out.println("--- Java Pattern Generator ---");
        System.out.println("""
    1. Square                     2. Left Triangle             3. Inverted Left Triangle
    4. Right Triangle              5. Inverted Right Triangle    6. Pyramid
    7. Inverted Pyramid           8. Diamond                   9. Hollow Square
    10. Hollow Triangle           11. Hollow Pyramid           12. Floyd Triangle
    13. Number Triangle           14. Reverse Number Triangle  15. Repeated Number Triangle
    16. Alphabet Triangle         17. Same Alphabet Pattern    18. Reverse Alphabet Pattern
    19. Binary Pattern            20. Butterfly Pattern        21. Pascal Triangle
    22. Sandglass Pattern         23. Cross Pattern            24. Zigzag Pattern
    """);
        System.out.print("\nSelect a pattern (1-24): ");

        int choice = sc.nextInt();
        System.out.print("Enter size (n): ");
        int n = sc.nextInt();

        System.out.println("\nResult:");
        switch (choice) {

            case 1 -> p.square(n);
            case 2 -> p.leftTriangle(n);
            case 3 -> p.invertedLeftTriangle(n);
            case 4 -> p.rightTriangle(n);
            case 5 -> p.invertedRightTriangle(n);
            case 6 -> p.pyramid(n);
            case 7 -> p.invertedPyramid(n);
            case 8 -> p.diamond(n);
            case 9 -> p.hollowSquare(n);
            case 10 -> p.hollowTriangle(n);
            case 11 -> p.hollowPyramid(n);
            case 12 -> p.floydTriangle(n);
            case 13 -> p.numberTriangle(n);
            case 14 -> p.reverseNumberTriangle(n);
            case 15 -> p.repeatedNumberTriangle(n);
            case 16 -> p.alphabetTriangle(n);
            case 17 -> p.sameAlphabetPattern(n);
            case 18 -> p.reverseAlphabetPattern(n);
            case 19 -> p.binaryPattern(n);
            case 20 -> p.butterflyPattern(n);
            case 21 -> p.pascalTriangle(n);
            case 22 -> p.sandglassPattern(n);
            case 23 -> p.crossPattern(n);
            case 24 -> p.zigzagPattern(n);
            default -> System.out.println("Invalid choice!");
        }

        sc.close();
    }
}