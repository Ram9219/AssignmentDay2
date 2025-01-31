import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int x=sc.nextInt();
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x/=10;
        }
        System.out.println("The reverse of the given number is : "+rev);
    }
}
