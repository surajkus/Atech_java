
class constructor{
    public static void main(String args[]){
        cons c = new cons("Saraswati vidya mandir rajrappa project", "Suraj kumar",27);
        cons c2= new cons("chitarpur inter colllage");
       cons c3 =new cons();
       c.display();
       c2.display();
       c3.display();
    }

}

class cons{
    String  school;
    String   name;
    int rollno;

    cons(String school, String name, int rollno) {
        this.school = school;
        this.name = name;
        this.rollno = rollno;
    }
    cons(String school) {
        this.school = school;
        this.name = "kunal jha";
        this.rollno = 24;
    }
    cons() {
        this.school = "sarala birala university ranchi ";

        this.name = "suraj kushwaha";
        this.rollno = 345;
    }
   void display(){
    System.out.println("school name is = "+school+ " student name = " +name+ "roll name = " +rollno);
    }


}