package patterns;

import java.lang.reflect.Method;
import java.util.Scanner;

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

    void L_Tri(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void Inv_L_Tri(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void R_Tri(int n) {
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

    void Inv_R_Tri(int n) {
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

    void Inv_pyramid(int n) {
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

    void Hollow_Square(int n) {
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

    void hallow_tri(int n) {
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

    void hallow_pyramid(int n)
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

    void Floyd_Triangle(int n)
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

    void number_tri(int n)
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

    void reverse_number_tri(int n)
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

    void repeated_number_tri(int n)
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

    void Alphabet_Tri(int n)
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

    void same_alpha_pat(int n)
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

    void reverse_alpha_pat(int n)
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

    void binary_pattern(int n)
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

    void Butterfly_Pattern(int n)
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

    void pascal_triangle(int n)
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

    void sandglass_pattern(int n)
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

    void cross_pattern(int n)
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

    void zigzag_pattern(int n)
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
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Pat p = new Pat();

        Method[] methods = Pat.class.getDeclaredMethods();

        for (Method m : methods) {
            if (!m.getName().equals("main")) {
                try {
                    System.out.println("\npatterns.Pattern: " + m.getName());
                    m.invoke(p,5);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        sc.close();
    }
}

