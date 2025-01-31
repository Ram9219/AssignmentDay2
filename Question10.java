import java.util.*;
class Student{
    String name;
    int roll;
    float marks;
    Student(String n,int x,float y){
        this.name=n;
        this.roll=x;
        this.marks=y;
    }
    void display(){
        System.out.println("Name: "+name+"\nRoll: "+roll+"\nMarks: "+marks);
    }
    void update(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the new marks ");
        marks=sc.nextFloat();
        display();
    }
}
public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name ");
        String name=sc.nextLine();
        System.out.println("Enter the roll no .");
        int roll=sc.nextInt();
        System.out.println("Enter the marks ");
        float marks=sc.nextFloat();
        Student s=new Student(name,roll,marks);
        s.display();
        s.update();
        
    }
}
