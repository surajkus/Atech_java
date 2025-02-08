
public class method_overloading {
    // method overloading in java
    public static void main(String[] argus) {
       s(5,4 ,9);
       s(49,34);
       s(6.0f,7.0f,4.0f);
    }


    public static void s(int a, int b, int c) {
        System.out.println("This is three integers number  "+ a+b+c);
    }

    public static void s(int a, int b) {
        System.out.println("This is two integer number   " +a+b);
    }


    public static void s(float a, float b, float c) {
        System.out.println("This is three float number" + a+b+c);
    }


}