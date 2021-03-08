import java.util.Scanner;  // Import the Scanner class
public class test{
    public static void main(String[] args) {
        System.out.println("Hello World.");
        int a;
        int b;

        Scanner sr = new Scanner(System.in);

        System.out.println("Enter 1st number");
        a = sr.nextInt();
        System.out.println("Enter 2nd number");
        b = sr.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

       }
}