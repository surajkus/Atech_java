import java.util.Arrays;
import java.util.Scanner;

public class seconddays {
    public static void main(String[] args) {
  int[] arr={5,3,2,1,0};
  Arrays.sort(arr);
   for( int i=0;i<arr.length;i++){
       if(i!=arr[i]){
           System.out.println(i);
           break;
       }

   }

    }
}
