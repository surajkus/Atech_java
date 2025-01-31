

public class Operator {

    public static void main(String[] agrs)
    {
    // Arithmetic operator
    int x = 100;
    int y = 20;
         System.out.println(x + y);
         System.out.println(x - y);
         System.out.println(x * y);
         System.out.println(x / y);
         System.out.println(x % y);
         System.out.println(++x); // x++increment
         System.out.println(--x);  //--x increment

    // Assigment operator
    int numb= 5;
        System.out.println(numb = 5);
        System.out.println (numb += 3);
        System.out.println (numb-= 3);
        System.out.println (numb *= 3);
        System.out.println (numb /= 3);
        System.out.println (numb %= 3);
        System.out.println (numb &= 3);
        System.out.println (numb<<= 3);
        System.out.println ( numb>>= 3);

    // comparison operator
    int a=5;
    int b=6;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);


    //logical operators
    int num3 = 5;
        System.out.println(num3 > 3 && num3 < 10);
        System.out.println(num3 > 3 || num3 < 4);
        System.out.println(!(num3 > 3 && num3 < 10));

}
}






