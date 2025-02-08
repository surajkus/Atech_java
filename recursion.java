import java.util.Scanner;
public class recursion {
//    // this is a recursion
//    public static void main(String[] a) {
//        int i = 5;
//        System.out.println("factorial  is " + factorial(i));
//    }
//
//    public static int factorial(int i) {
//        // base point
//        if (i == 0) {
//            return 1;
//        } else {
//            return i * factorial(i - 1);
//        }
//    }
//
//    //home work  task
//    // funding sum of n numbers of integer numbers(take input from user)

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to finding a Natural number");
        int i = sc.nextInt();
        System.out.println("natural number is " + naturalno(i));


    }
        public static int naturalno(int i){
            if (i == 0) {
                return 0;
            } else {
                return i + naturalno(i - 1);
            }

        }
}