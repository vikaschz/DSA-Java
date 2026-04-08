package patterns;

import java.util.Scanner;

public class HollowPattern
{
    private static void Hollow_Square(int n) {
        System.out.println("Hollow Square");
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

    private static void hallow_tri(int n) {
        System.out.println("Hallow Triangle");
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

    private static void hallow_pyramid(int n)
    {
        System.out.println("Hallow Pyramid");
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

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        Hollow_Square(n);
        hallow_tri(n);
        hallow_pyramid(n);

        sc.close();
    }
}
