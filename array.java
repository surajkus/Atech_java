import java.util.Arrays;

public class array {
public static void main(String args[]){

    //declare the variables;
    int[] arr ={2,34,21,15,67,87,34,56,78,32};
    System.out.println(Arrays.toString(arr));


    // method of arrays in java;
    int[] arr1;
 arr1 = new int[8];
 Arrays.fill(arr1,100);
   System.out.println(Arrays.toString(arr1));


    int[] arr2 = {2,3,44,55,12,20,34,28,60,87,45};
  Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));

    int[] original = {12,31,43,516,232,332,112,121,211};
    int[] copied = Arrays.copyOf(original, 5);
    System.out.println(Arrays.toString(original));
    System.out.print(Arrays.toString(copied));




}
}
