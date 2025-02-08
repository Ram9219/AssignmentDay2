import java.util.*;
public class Question18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=sc.nextInt();
        if((year %4==0 && year %100!=0)||(year%400==0 )){
            System.out.println(year +" This is a Leap year.");
        }
        else{
            System.out.println(year +"This is not a Leap year.");
        }
    }
}
