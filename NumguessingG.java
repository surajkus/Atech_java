import java.net.SocketOption;
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
        System.out.println("Welcome in number guessing Game  ");
        System.out.println("Lets in game Think a number between 1 to 100");
        while (!matched) {
            System.out.println("Enter your guess");
            user_input = sc.nextInt();
            if (user_input == num) {
                System.out.println("Congratulations You win ! !");
                System.out.println("Points : " + point);
                matched = true;
            } else if (user_input > num) {
                System.out.println("oops! think a small number..");
                point--;
            }
          else{
              System.out.println("oops! think big");
              point--;
            }
        }
    }
}
