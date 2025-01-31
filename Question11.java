import java.util.*;
class Area{
    double x,y;
    Area(double x, double y){
        this.x=x;
        this.y=y;
    }
    double calculateArea(double x){
        System.out.println("Drawing a circle..");
        return (x*x)*(3.14);// for 
    }
    double calculateArea(double x, double y){
        System.out.println("Drawing a rectangle..");
        return x*y;
    }
    void display(){
        System.out.println("This is a Shape");
        System.out.println("Area of Circle : "+calculateArea(x));
        System.out.println("Area of Rectangle: "+calculateArea(x,y));
    }
}
public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values : ");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        Area a=new Area(x,y);
        a.display();

    }
}
