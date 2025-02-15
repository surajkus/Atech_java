public class Method_overriding {
    public static void main(String[] argus)
    {
      fruits f = new fruits();
        f.color();
        vegitables v = new vegitables();
         v.color();


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
        System.out.println("yellow");
    }

 }