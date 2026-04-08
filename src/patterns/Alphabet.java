package patterns;

import java.util.Scanner;

public class Alphabet
{
    private static void Alphabet_Tri(int n)
    {
        System.out.println("Alphabet Triangle.");
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

    private static void same_alpha_pat(int n)
    {
        System.out.println("Alphabet Same Pattern.");
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

    private static void reverse_alpha_pat(int n)
    {
        System.out.println("Alphabet Reverse Pattern.");
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Alphabet_Tri(n);
        same_alpha_pat(n);
        reverse_alpha_pat(n);

        sc.close();
    }
}
