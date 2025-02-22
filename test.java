public class test {
    public static void main(String args[]){

      MO(2,"suraj")  ;
      MO("Kumar",7f);
      MO(2,4);
      MO(6.445d,"ram");



    }
 static void MO(int a, String s){
     System.out.println( "this number is interger = " +a+ " and String value = " +s);
}
    static void MO(String b, Float s){
        System.out.println( "this number is String = " +b+ " and float value = " +s);
}
    static void MO(int c, int  x){
        System.out.println( "this number is interger = " +c+ " and integer value = " +x);
}
    static void MO(String z, String s){
        System.out.println( "this number is String = " +z+ " and String value = " +s);
}
    static void MO(double a, String s){
        System.out.println( "this number is double = " +a+ " and String value = " +s);
}
}
