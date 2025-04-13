import java.util.*;

public class revers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str =sc.nextLine();
         String   resvers ="";
        for(int i=str.length()-1;i>=0;i--){
            resvers +=str.charAt(i);

        }

        System.out.println(resvers);
    }
}
