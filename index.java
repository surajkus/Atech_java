import java.util.Scanner;


public class index {
    int totalmin;
    public static void main(String[] args) {
        AP a=new AP();
        a.d(11);
    }
    }
    class AP {

      int d(int i) {
          int time=0;

          Scanner sc = new Scanner(System.in);

          System.out.println("time calculate");
          int input =sc.nextInt();
          System.out.println("input  " +input);


           time = 2 * (input - 1);
          int min= 30;
          int totalmin = time + min;

          // Adjust hour and minutes accordingly
          int hour = i;
          if (totalmin >= 60) {
              hour += totalmin / 60;
              totalmin= totalmin % 60;
          }
              int n = totalmin;

          if (hour<12) {
                System.out.println("output "+(hour)+":"+String.format("%02d", n) +"am");

            }
            else if(hour>=12) {
             System.out.println("output "+(hour)+":"+String.format("%02d", n)+"pm");
            }
            else if(hour>24)
              System.out.println("output "+(hour)+":"+String.format("%02d","%02d", n)+"pm");
          return time;
      }


    }
