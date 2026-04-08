package patterns;
import java.util.Scanner;

public class BasicStartPattern
{
    private static void square(int n) {
        System.out.println("Square");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void Left_Triangle(int n) {
        System.out.println("Left Triangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");}
            System.out.println();

        }
    }

    private static void Inverted_Left_Triangle(int n) {
        System.out.println("Inverted Left Triangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void Right_Triangle(int n) {
        System.out.println("Right Triangle");
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

    private static void Inverted_Right_Triangle(int n) {
        System.out.println("Inverted Right Triangle");
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
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        square(n);
        Left_Triangle(n);
        Inverted_Left_Triangle(n);
        Right_Triangle(n);
        Inverted_Right_Triangle(n);
        sc.close();
    }
}