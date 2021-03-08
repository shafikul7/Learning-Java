import java.util.Scanner;  // Import the Scanner class
public class Condition{
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Number");
        i=sc.nextInt();

        if(i>18){
          System.out.println("pass"); 
        }else{
            System.out.println("fail");
        }
    }
}