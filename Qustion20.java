import java.util.*;

public class Qustion20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter the operator ");
        char c=sc.next().charAt(0);
        int result =0;
        boolean valid=true;
        switch (c) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                if(b!=0){
                    result=a/b;
                }else{
                    System.out.println("Error: Division by zero");
                    valid=false;
                }
                break;
                case '%':
                if(b!=0){
                    result=a%b;
                }
            default:
                System.out.println("Error: Invalid operator");
                valid=false;
            
        }
if(valid){
    System.out.println("Result is : "+result );
}
    }
}
