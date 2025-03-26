import java.util.Scanner;
class calculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll no. = ");
        int num = sc.nextInt();
        int h = 11;
        int min = 30;
        String s = "am";


        int time = h * 60 + min;
        int timeof = time + num * 2 - 2;
        int hour = timeof / 60;
        int Min = timeof % 60;


        if (timeof >= 12) {
            int Time = hour / 12;

            if (Time % 2 == 1) {
                s = s.equals("am") ? "pm":"am";
            }
        }
                    int Hour =hour %12;
                if(Hour ==0)

    {
        Hour = 12;
    }
                System.out.println("Time ="+Hour +":"+Min +s);

}
}
