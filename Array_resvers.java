import java.util.*;
// revers of arrays...................................`+
public class Array_resvers {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int left = 0, right = arr.length-1;
        while(left<right)
        {
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right]= temp;
           right--;
           left++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
