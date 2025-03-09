public class Checklargest {
    public static void main(String[] args) {
        // largest number check in the arrays..
        int[] arr = {3, 8, 9, 12, 14, 13, 16, 19, 645, 480, 1, 24, 25, 28, 31, 70, 100,0, 210};
        int max = arr[0];
        for (int num : arr) {
            if (max < num)
                max = num;
        }
        System.out.println("maximum number is = " + max);

        // smallest number in the given arrays..
        int min = arr[0];
        for(int  num: arr){
            if(min>num)
                min= num;


        }
        System.out.println("minimum number is = "+min);
    }
}