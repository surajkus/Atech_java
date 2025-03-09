import java.util.*;
public class Question {
    public static void main(String args[]) {

        int[] arr1 = {1, 3, 6, 8};
        int[] arr2 = {2, 5, 7, 9};
        int[] sum = new int[4]; // Initialize sum array

        for(int i=0;i<arr1.length;i++){
            sum[i]= arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(sum));
    }
}

