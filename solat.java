import java.util.Scanner;

public class solat {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter  string");
        String n = sc.nextLine();
        String salting ="s";
        String result ="";
        for( int i=0;i<n.length();i++){
          result += n.charAt(i)+salting;
        }
        System.out.println(result);


    }
}
