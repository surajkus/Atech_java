import java.util.Scanner;
// table print using for loops in java programming
public class loop {
    public static void main(String[] argus)
    {
        Scanner er = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = er.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a +"x" +i +"=" +i*a);
        }


        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.print("Happy New Year!!");



    }



}
