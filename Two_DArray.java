import java.util.*;
public class Two_DArray {
    public static void main(String args[]) {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6, 7},
                {2, 3, 5, 7, 8, 12, 13},
                {13, 3, 4, 78, 91, 27, 47}
        };

        // deepToString method are used to traverses of 2d arrays
        System.out.println(Arrays.deepToString(arr));
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr[i].length;j++)
//            {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//         }
//        for (int[] num : arr) {
//            for (int n : num) {
//
//                System.out.print(n + " ");
//            }
//            System.out.println();
//      }
    }
}