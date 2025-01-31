import java.util.Scanner;

public class Convert {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer value :");
        int n=sc.nextInt();
        System.out.println("Enter the double value :");
        Double val=sc.nextDouble();
        System.out.println("Enter the character :  ");
        char c = sc.next().charAt(0);
        System.out.println("Enter true or false :");
        boolean b=sc.nextBoolean();
        double d=(double)n;
        System.out.println("Int convert into double: "+d);
        int x=(int)c;
        System.out.println("Char convert into int : "+x);
        
        
    }
}
