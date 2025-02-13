
package over;
public class constructor {
    public static void main(String[] argus) {
//    {
//         car c1 = new  car("scropio","black",2006);
//         car c2 = new car("xs11");
//         car c3 = new car();
//         c1.display();
//         c2.display();
//         c3.display();
//
//
//
//    }
//}
//
//
//
//class car {
//    String model;
//    String color;
//    int LaunchDate;
//
//
//car(String model,String color,int LaunchDate){
//    this.model=model;
//    this.color= color;
//    this.LaunchDate= LaunchDate;
//
//}
//car(String model){
//    this.model = "model";
//    this.color= "pink";
//    this.LaunchDate = 2003;
//}
//car(){
//    this.model="creta";
//    this.color="yellow";
//    this.LaunchDate= 2011;
//}
//
//
//void display(){
//    System.out.println("Model= " +model + " color= " +color + " LaunchDate =" +LaunchDate);
//}
//
//}

mobile M1 = new mobile("oppo","MX!290oppo","snapdragon",2022);
mobile M2 = new mobile("Realme","RM2013");
mobile M3 =new mobile();
M1.display();
M2.display();
M3.display();

    }
}

class mobile{
    String Name;
    String model;
    String processor;
    int LaunchDate;


mobile(String Name ,String model ,String processor, int LaunchDate) {
    this.Name = Name;
    this.model = model;
    this.processor = processor;
    this.LaunchDate = LaunchDate;
}

mobile(String Name , String model){
    this.Name  = Name;
    this.model = model;
    this.processor= "hellio";
    this.LaunchDate = 2003;
}
mobile(){
    this.Name = "Samsung";
    this.model = "SM1220";
    this.processor = "snapdragon";
    this.LaunchDate =2022;
}
    void display () {
        System.out.println("Name =" + Name + "  Model= " + model + "   Processor= " + processor + "  LaunchDate= " + LaunchDate);
    }
}