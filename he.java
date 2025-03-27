import java.util.Scanner;

public class he {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Name");
        String n =sc.nextLine();
       int index=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)==' '){
                index=i;
            }
        }
            System.out.println(n.charAt(0)+"."+ n.substring(index).trim());

    }
}
