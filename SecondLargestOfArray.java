package JavaSetQuestions;

import java.util.Scanner;

//Write a java program to find second largest element from a given unsorted integer array.

public class SecondLargestOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int secmax = arr[1];
        if (secmax>max){
            int temp=max;
            max=secmax;
            secmax=temp;
        }
        for (int i=2;i<arr.length;i++){
           if (arr[i]>max) {
               max = arr[i];
           }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]>secmax){
                if (arr[i]==max)
                    continue;
                secmax =arr[i];
            }
        }
        System.out.println("The second largest element in the array is: "+secmax);
    }
}
