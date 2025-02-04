import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int w = s.nextInt();
        switch (w) {
            case 1:
                System.out.print("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;

            case 4:
                System.out.println("wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;


            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("invaild number  Enter number between 1 to 6");
        }
// print Moring Evening and night in java....
   System.out.println("(!! print Moring,Evening and night....)");
        System.out.println("Enter number");
        int d = s.nextInt();
        switch(d){
       case 1:
       System.out.print("Good moring everyone");
       break;

      case 2:
      System.out.print("Good afternoon everyone");
      break;

      case 3:
      System.out.print("Good Evening Everyone");
      break;

      case 4:
      System.out.print("Good night everyone");
      break;

      default:
     System.out.print("invaild number choose b/w 1 to 4");


     }
}
}