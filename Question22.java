import java.util.*;
public class Question22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1  :");
        String s=sc.nextLine();
        System.out.println("Enter the string 2: ");
        String s1=sc.nextLine();
        char c[]=s.toCharArray();
        Arrays.sort(c);
        char c1[]=s1.toCharArray();
        Arrays.sort(c1);
        if(Arrays.equals(c,c1)){
            System.out.println("Both strings are anagrams");
        }
        else{
            System.out.println("Both strings are not anagrams");
        }

    }
}
