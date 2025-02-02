import java.util.Random;
import java.util.Scanner;
// Number guessing game in java
public class NumguessingG {

    public static void main(String[] argus)
    {
        Random ram = new Random();
        int num = ram.nextInt( 100);
        Scanner sc = new Scanner(System.in);
        int user_input,point= 100;
        boolean matched = false;
        while (!matched) {
            System.out.println("Enter a number");
            user_input = sc.nextInt();
            if (user_input == num) {
                System.out.println("You win ! !");
                System.out.println("Points : " + point);
                matched = true;
            } else if (user_input > num) {
                System.out.println("think a small number..");
                point--;
            }
          else{
              System.out.println("thing big");
              point--;
            }
        }
    }
}
