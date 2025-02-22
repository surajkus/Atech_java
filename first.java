public class first {
    public static void main(String args[]) {
        college a = new college();
        univ b = new univ();
        b.move();
        a.move();

    }
}
class college {
    public void move() {
        System.out.println("College is open");
    }
}
class univ extends college {
    public void move() {
        System.out.println("University is open too");
    }
}
