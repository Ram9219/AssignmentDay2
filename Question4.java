import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int Age=sc.nextInt();
        System.out.println("Enter your Monthly income :");
        double income=sc.nextDouble();
        System.out.println("IS there any pending amount in True or False :");
        boolean pending=sc.nextBoolean();
        System.out.println(
            "Your eligibility For Premium Membership : " +
            (Age >= 18 && income > 30000 &&!pending? "Eligible" : "Not Eligible")
        );
    }
}
