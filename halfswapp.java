import java.util.Scanner;

public class halfswapp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value");
        String input1 = sc.nextLine();
       String input2=sc.nextLine();
   //jharkhandi -kashhandi
        //kashmiri-jharkmiri
       int str = input1.length() / 2;
       int str2=input2.length()/2;
       String firstHalf = input1.substring(0, str);
       String secondHalf=input1.substring(str);
       String firstHalf1 = input2.substring(0, str2);
        String secondHalf2=input2.substring(str2);
        System.out.println("output = "+firstHalf+secondHalf2);
        System.out.println("output= "+firstHalf1+secondHalf);
      sc.close();
    }
}
//        int Str1= input2.length()/2;



        //String s =input1.concat(output2);
        //System.out.println(s);
  //  }
//}
