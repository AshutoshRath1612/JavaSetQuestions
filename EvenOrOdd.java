package JavaSetQuestions;

import java.util.Scanner;

/*
Write a java program to check whether a number is even or not without using arithmetic
or relational operator.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int xor = n&1;
        switch (xor){
            case 0 -> System.out.println(n+ " is an even number");
            case 1 -> System.out.println(n+ " is an odd number");
        }
    }
}
