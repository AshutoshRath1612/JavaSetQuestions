package JavaSetQuestions;
//Write a java program to find greatest between two numbers without using if-else and
//conditional operator. (in-built method should not be used)

import java.util.Scanner;

class GreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a =sc.nextInt();
        System.out.print("Enter the second number: ");
        int b =sc.nextInt();

        //Method 1(Using loops)
        int count = 0;
        int num1 = a , num2 = b;
        while(num1>0 || num2 >0){
            num1--;
            num2--;
            count++;
        }
        System.out.println("The largest number between is: "+ count);

        //Using Math.abs
        int largest = (a +b + Math.abs(a-b))/2;
        System.out.println("The largest number between is: "+ largest);
    }
}