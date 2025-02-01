import java.util.Scanner;
public class control_flow {

    public static void main(String[] args)
    {
        Scanner sr= new Scanner(System.in);
        System.out.println("Enter a age");
        int age = sr.nextInt();
        if(age>=18)
        {
            System.out.println("yes you are eiligible  for vote");
        }
        else{
            int remaning = 18-age;
            System.out.println("no you are eiligible for vote. You are  waiting for voting  " +  remaning + " years");
        }

    }

}
