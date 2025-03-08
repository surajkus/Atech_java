import java.util.*;

public class array {
public static void main(String args[]){

//    //declare the variables;
//    int[] arr ={2,34,21,15,67,87,34,56,78,32};
//    System.out.println(Arrays.toString(arr));
    // (when you are direct write arr name inside the sout then print address of array not a arrays)
//
//
//    // method of arrays in java;
//    int[] arr1;
// arr1 = new int[8];
// Arrays.fill(arr1,100);
//   System.out.println(Arrays.toString(arr1));
//
//
//    int[] arr2 = {2,3,44,55,12,20,34,28,60,87,45};
//  Arrays.sort(arr2);
//    System.out.println(Arrays.toString(arr2));
//
//    int[] original = {12,31,43,516,232,332,112,121,211};
//    int[] copied = Arrays.copyOf(original, 5);
//    System.out.println(Arrays.toString(original));
//    System.out.println(Arrays.toString(copied));
//
//    int[] A = {12,31,43,516,232,332,112,121,211};
//    int[] B = Arrays.copyOfRange( A,3, 5);
//    System.out.println(Arrays.toString(A));
//    System.out.println(Arrays.toString(B));
//
//    int[]  array= {1,2,3,4,5};
//    int[] array2={1,3,2,4,5,8,14,16,29,60,64,80};
//    int[] array3= {1,2,3,4,5};
//    int index= Arrays.binarySearch(array2,60);
//    System.out.println(index);

    // arraycopy (copy of array)-----
    int[] arr3={1,2,3,4,5,6};
    int[] arr4 = new int[5];
    System.arraycopy(arr3,0,arr4,0,5);
    System.out.println(Arrays.toString(arr4));

    //list arrays in java

    String[] name={"suraj","kundan","harekrishna","kushal"};
    System.out.println(Arrays.toString(name));
    List<String> friend_name= Arrays.asList(name);
    System.out.println(friend_name);


    // addition of arrays.
   int[] arr5={1,2,3,4,1,8,9,10};
   int   sum= 1;
   for(int i=0 ; i<arr5.length;i++)
   {
       sum = sum + arr5[i];
   }
    System.out.println("sum of all numbers in arrays "+sum);
for( int i: arr5)
{
    sum =sum * i;
}
    System.out.println("mutilple of all numbers in arrays " +sum);
}

}
