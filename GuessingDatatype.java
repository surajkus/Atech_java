import java.util.Scanner;
public class GuessingDatatype {
    public static void main(String[] argus)
    {
    choice ch = new choice();

    }
}
class choice {
    choice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            choice(i);
        }
         else if (sc.hasNextDouble()) {
            Double i = sc.nextDouble();
            choice(i);
        }
     else{
            String i = sc.next();
            choice(i);
        }

    }
    void  choice(int i) {
        System.out.println("this is a integers numbers");
    }

   void  choice(Double i) {
        System.out.println("this is a double  numbers");
    }

     void choice(String i) {
        System.out.println("this is a String numbers");
    }



}