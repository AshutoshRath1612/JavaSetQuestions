package JavaSetQuestions;

import java.util.Arrays;

public class RemoveDuplicateElem {
    public static void main(String[] args) {
        int [] arr = {1 ,2,3,4,1,2,3,2,4,3,2,5,1,2,4,4,5,2};
        for (int i=0;i<arr.length;i++){
            for (int j=0; j<i; j++){
                if (arr[j] == arr[i]){
                    arr[j]=0;
                }
            }
        }
        Arrays.sort(arr);
            System.out.print("[");
        for (int i =0 ; i<arr.length;i++){
           if (arr[i]>0){
               System.out.print(arr[i]);
               if (i== arr.length-1)
                   continue;
               System.out.print(",");
           }
        }
        System.out.print("]");

    }
}
