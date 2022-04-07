package JavaSetQuestions;

//Write a java program to arrange the element of an integer array so that all negative
//element will be at one side and all positive element will be in other side.

import java.util.Scanner;

public class SameSignOneSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int [] arrSort = new int[n];
        int j=0,k=0;
        for (int i=0;i<arrSort.length;i++){
            if(arr[i]<0){
                arrSort[j]= arr[i];
                j++;
            }
            else if(arr[i]>=0){
                arrSort[arrSort.length-1-k] = arr[i];
                k++;
            }
        }
        System.out.print("[");
        for (int i =0;i<arrSort.length;i++){
            System.out.print(arrSort[i]);
            if (i== arr.length-1)
                continue;
            System.out.print(",");
        }
        System.out.print("]");
    }
}
