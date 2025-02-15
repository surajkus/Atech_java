public class Super_Class {
    public static void main(String[] argus){
    Son s = new Son();

    }
}

class grandFather{
   grandFather(){
        System.out.println("Skin black and  height 6.4 inch");
    }
}
class Father extends grandFather{
    Father() {
      super();
       System.out.println("Skin black and height 6 inch");
   }
}
class Son extends Father{
    Son(){
        super();
        System.out.println("skin black");
    }

}