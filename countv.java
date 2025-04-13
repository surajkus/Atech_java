import java.util.Scanner;

public class countv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  String value to find vowels ");
        String str=sc.nextLine();
        int count =0;
        String vowels[]={"a","e","i","o","u"};
        for(int i=0;i<str.length();i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (String.valueOf(str.charAt(i)).equals(vowels[j])){
                    count ++;
            }
        }
        }
        System.out.println(count);

    }
}
