package patterns;
import java.util.Scanner;

public class Pyramid
{
    private static void pyramid(int n) {
        System.out.println("pyramid");
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

    private static void Inverted_pyramid(int n) {
        System.out.println("Inverted pyramid");
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

    private static void Diamond(int n) {
        System.out.println("Diamond");
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

    private static void hallow_pyramid(int n)
    {
        System.out.println("hallow pyramid");
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
    private static void sandglass_pattern(int n)
    {
        System.out.println("sandglass pattern");
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


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");
       int n = sc.nextInt();
       pyramid(n);
       Inverted_pyramid(n);
       hallow_pyramid(n);
       sandglass_pattern(n);
       Diamond(n);


       sc.close();
   }
}
