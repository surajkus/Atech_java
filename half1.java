import java.util.*;
public class half1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First string");
        String str =sc.nextLine();
        //jharkhandi =jharkmiri
        //kashmiri   =kashhkandi
        System.out.println("Enter  Second string");
        String str2=sc.nextLine();
        int len_1= str.length();
        int len_2= str.length();
         String res1="";
         String res2="";
         String res3="";
         String res4="";
        for(int i=0;i<len_1;i++){
            if(i<len_1/2){
                res1 +=str.charAt(i);
            }
            else {
                res2 +=str.charAt(i);
            }
        }
        for(int j=0;j<len_2;j++){
            if(j<len_2/2){
                res2 +=str2.charAt(j);
            }
            else {
                res3 +=str2.charAt(j);
            }
        }

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}
