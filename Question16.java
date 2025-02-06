import java.util.*;
public class Question16 {
    public static int fib(int n){
        if(n==0 || n==1)return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  for fib : ");
        int n=sc.nextInt();
        System.out.println("The fibonacci number at position "+n+" is : "+fib(n));
        System.out.println("Printing the series of fibonacci numbers");
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
