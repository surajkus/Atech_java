public class hello {
    public static void main(String args[]){
    ho h =new ho();
    h.display(45);
    }
}

class ho{
    int x;

    void display(int x){
        this.x = x;
        System.out.println(" this is integer number " +x);

    }
}