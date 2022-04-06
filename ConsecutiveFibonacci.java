package JavaSetQuestions;

import java.util.Scanner;

    /*
    Write a java program to check whether two given number ‘a’ and ‘b’ are consecutive
    term in the Fibonacci series or not.
     */

public class ConsecutiveFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        int min = Math.min(a ,b);
        int max = Math.max(a,b);
        if (max-min<min){
            System.out.println(a + " and " + b + " are Consecutive Fibonacci Numbers");
        }
        else{
            System.out.println(a + " and " + b + " are not Consecutive Fibonacci Numbers");
        }
    }
}
