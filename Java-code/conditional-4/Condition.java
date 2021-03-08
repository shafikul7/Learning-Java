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

import java.util.Scanner;  // Import the Scanner class
public class Condition{
    public static void main(String[] args) {
        float number;
        Scanner sc = new Scanner(System.in);
        number= sc.nextFloat();
        String result;

        if(number ==80){
            result ="A+";
        }else if(number == 70){
            result ="A";
        }else if(number == 60){
            result ="A-";
        }else{
            result ="fail";
        }
        System.out.println("this is result : " + result);
        
    }
}
