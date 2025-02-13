public class inheritanceheiarchal {
    public static void main(String argus[]) {
   dog d = new dog();
   d.sound("bhawo");
   cat c = new cat();
   c.sound("meawu");
    }
}



class animal{
    void sound(String s){
        System.out.println(s);
    }


}

class cat extends animal{

}

class dog extends cat{




}