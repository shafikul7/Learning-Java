import java.util.Scanner;  // Import the Scanner class
public class Loop{
    public static void main(String[] args) {
        String name ="Md.Shafikul islam";

        for(int i=0; i<10; i++){

            System.out.println("My name is : " +i+ name);
        }

        
    }
}


import java.util.Scanner;  // Import the Scanner class
public class Loop{
    public static void main(String[] args) {
        String name ="Md.Shafikul islam";

        for(int i=1; i<100; i++){
             if(i%10==0){
            System.out.println("My name is : " +i+ name);
        
        } 
    }

        
    }
}

import java.util.Scanner;  // Import the Scanner class
public class Loop{
    public static void main(String[] args) {
        int n=10;
        int sum=0;

        for(int i=1; i<=n; i++){
            sum+=i;
        
        } 
        System.out.println(sum);
    }
}


import java.util.Scanner;  // Import the Scanner class
public class Loop{
    public static void main(String[] args) throws InterruptedException {
    int limit;
        Scanner sr = new Scanner(System.in); 
        System.out.println("Enter the Acoumt of second");
        limit = sr.nextInt();
        for(int i=limit; i==0;i++){
            System.out.println("Time limit" + i);
            Thread.sleep(1000);

        }
        System.out.println("Time count complit" );
    }
}


import java.util.*;
  // Import the Scanner class
public class Loop{
    public static void main(String[] args) {
        int sum = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // take integer input from the user
    System.out.println("Enter a number");
    int number = input.nextInt();
	   
    // while loop continues 
    // until entered number is positive
    while (number >= 0) {
      // add only positive numbers
      sum += number;

      System.out.println("Enter a number");
      number = input.nextInt();
    }
	   
    System.out.println("Sum = " + sum);
    input.close();
  }
}

import java.util.Scanner;  // Import the Scanner class
public class Loop{
    public static void main(String[] args) {
        float number;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter number");
        number= sc.nextFloat();
            if(number==999.0){
                break;
            }
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
}
    
