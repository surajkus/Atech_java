import java.util.Scanner;

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
//        System.out.println(a);
    }
}
