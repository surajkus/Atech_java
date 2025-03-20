public class InheritanceSingle {
    public static void main(String[] arugs) {
        honda h1 = new honda();
         h1.car_Name("hondaQ188");

        }
    }

    class cars{
        String car_Name;
        void car_Name(String car_Name){
           this.car_Name= car_Name;
            System.out.println("car model is "+car_Name);
        }

}

class honda extends cars{
  
}