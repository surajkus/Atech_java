public class Method_overriding {
    public static void main(String[] argus)
    {

        fruits f = new fruits();
        f.color();



    }
}

class vegitables {
    void color() {
        System.out.println("color");
    }

 }

 class  fruits extends vegitables{
  @Override
    void color(){
     super.color();
        System.out.println("yellow");
    }

 }