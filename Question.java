import java.util.*;
public class Question {
    public static void main(String args[]) {
//        //Adding of two arrays in java  condition is zero index of frist
//        // arrays and zero index of second arrays are added and store in zero
//        // indexing  add with ....
//        int[] arr1 = {1, 3, 6, 8};
//        int[] arr2 = {2, 5, 7, 9};
//        int[] sum = new int[4]; // Initialize sum array
//
//        for (int i = 0; i < arr1.length; i++) {
//            sum[i] = arr1[i] + arr2[i];
//        }
//        System.out.println(Arrays.toString(sum));
//

        // adding of 2d arrays...

        int[][] arr3 = {
                {1, 2, 4, 5, 7, 8, 9},
                {3, 5, 6, 9, 10, 11},
                {4, 6, 7, 8, 9, 0, 2}
        };
        int Sum=0;
        for (int[] num : arr3) {
            for(int add: num)
             Sum += add;
        }
        System.out.println(" adding of 2d arrays = "+Sum);
    }



}






