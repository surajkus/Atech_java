class first {
    public static void main(String[] arg)
    {
        char c ='A';
        int num =c;
        System.out.print(num);

                byte  z = 123;
                int d =z;
                System.out.print(d);

                int i  = 32;
                float A = i;
                System.out.println(A);

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