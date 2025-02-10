public class oops {
    public static void main(String[] argus) {

        worker w1 = new worker();
        w1.Name = "Rakesh kumar ";
        w1.id =  001;
        w1.shift = "10 pm to 6 pm";
        w1.address=  "Sarala birala university Ranchi mahilog ";
        w1.salary= 12000;
        w1.display();
    }


}
  class  worker{
    String Name ;
    int  id;
    String shift;
    String  address;
    float  salary;
 void display(){
     System.out.println("Name =" +Name+  " id=" +id + " shift =" +shift+ " address ="+ address+ "salary =" +salary);
 }
}