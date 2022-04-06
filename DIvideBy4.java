package JavaSetQuestions;

import java.util.Scanner;

/*
Write a java program to divide a number by 4 without using / operator.
 */
public class DIvideBy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to divide: ");
        int num = sc.nextInt();
        System.out.print("Enter the number you want to divide with: ");
        int n = sc.nextInt();
        int div = num;
        int count = 0;
        while (div>0){
            div -= n;
            count++;
        }
        System.out.println(count);
    }
}
