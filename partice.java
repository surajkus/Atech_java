import java.util.Scanner;
public class partice {
    public static  void main(String[] argus) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int w = s.nextInt();
        switch (w) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
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
                System.out.println("plz Enter number b/w 1 to 7");
        }
     out(w);
    }
     public static void out(int w){
        Scanner k = new Scanner(System.in);
         System.out.println("do you want to see previous and next days are printed then Enter (Yes and NO)");
       String s = k.next();
       switch(s)
       {
           case "yes","y","YES":
               System.out.println("your previous day is "+day(w-1));
               System.out.println("your next days is "+day(w+1));

           break;

           case "No","n":
           System.out.println("thanks you!! have a nice day ");
           break;
       }
    }
      public static String day(int w){
        switch(w){
            case 1:
                return("Sunday");
            case 2:
                return("Monday");

            case 3:
                return("Tuesday");

            case 4:
                return("wednesday");

            case 5:
                return("Thursday");

            case 6:
                return("Friday");

            case 7:
                return("Saturday");
//            default:
//                return ("plz enter a number is 1 to 7");

        }
        return "string";
      }
}
