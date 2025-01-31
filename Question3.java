import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        double discount = (amount > 5000) ? (20.0 / 100) * amount 
                        : (amount >= 3000 && amount <= 5000) ? (10.0 / 100) * amount 
                        : 0;  

        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + (amount - discount));

      
    }
}
