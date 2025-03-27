import java.util.Arrays;
import java.util.Scanner;

class w {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value in arrays");
        int arr=sc.nextInt();
        int arr1[]=new int[arr];
        for(int i=0;i<arr;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
    }

 }



