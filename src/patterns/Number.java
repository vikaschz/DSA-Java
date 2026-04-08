package patterns;

import java.util.Scanner;

public class Number
{
    private static void Floyd_Triangle(int n)
    {
        System.out.println("Floyd Triangle");
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

    private static void number_triangle(int n)
    {
        System.out.println("number triangle");
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

    private static void reverse_number_triangle(int n)
    {
        System.out.println("Reverse number triangle");
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

    private static void binary_pattern(int n)
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
    private static void repeated_number_triangle(int n)
    {
        System.out.println("Repeated number triangle");
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
    private static void pascal_triangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();}
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Floyd_Triangle(n);
        number_triangle(n);
        reverse_number_triangle(n);
        repeated_number_triangle(n);
        pascal_triangle(n);
        binary_pattern(n);


        sc.close();
    }
}
