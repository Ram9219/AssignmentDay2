import java.util.*;
public class Question12 {
    public static void  swap(int a[]){
        a[0]^=a[1];
        a[1]^=a[0];
        a[0]^=a[1]; 

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a=sc.nextInt();
        System.out.println("Enter the b: ");
        int b=sc.nextInt();
       int arr[]={a,b};

        swap(arr);
        a=arr[0];
        b=arr[1];
        System.out.println("The a is : " + a);
        System.out.println("The b is : " + b);

    }
}
