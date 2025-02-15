
public class Constructor_overloading {
    public static void main(String[] argus){
        X x = new  X();
    }
}
class X{
    int i;
    X(){
              this(5);
    }
    X(int i) {

    this("suraj");
    this.i = i;
    System.out.println(i);
    }
    X(String s){
//       this()
        System.out.println(s);
    }

}