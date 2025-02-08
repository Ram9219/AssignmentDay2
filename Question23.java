import java.util.*;

public class Question23 {
    //Pascal traingle ---->>>>
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int space =0;space<n-i;space++){
                System.out.print(" ");
            }
            int first=1;
            for(int j=0;j<=i;j++){
               System.out.print(first +" ");
               first=first*(i-j)/(j+1);
            }
            System.out.println( );
        }
    }
}
