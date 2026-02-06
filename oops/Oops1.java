public class Oops1 {
    public static void main(String[] args) {
        Pen p1=new Pen();// created a pen object named p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
class Student{
    String name;
    int age;
    float percentage;  //cgpa
     
    void calcPercentage(int phy, int chem, int maths){
        percentage=(phy+chem+maths)/3;
    }
}