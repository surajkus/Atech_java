public class InheriMultiLevel {
    public static void main(String[] argus){
      Hondas h = new Hondas();
      h.car_model();
    }
}
 class Body_maker{
    void body_Model(){
    System.out.print("Body are make in platinum body");
    }

 }
 class Cars1 extends Body_maker {
     String car_name;

     void car_of_Names(String car_name) {
         this.car_name = "car1";
         System.out.println("car name is" + car_name);


     }
 }
 class Hondas extends Cars1{
 void  car_model(){
 System.out.print("Honda city");
 }
}