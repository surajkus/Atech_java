import java.util.Scanner;
public class sumdigit {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int  sum = 0, rem;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // Keep dividing until the number is not zero
        while (num != 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of digits of the number is = " + sum);
    }
}
