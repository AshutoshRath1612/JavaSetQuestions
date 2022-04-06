package JavaSetQuestions;

import java.util.Scanner;

/*
Write a java program to find sum of digit of a given number until it becomes a single
digit number
 */
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sum=0;
        int temp = n;
        while(temp>9){
            sum += temp%10;
            temp /= 10;
        }
        System.out.println(sum);
    }
}
