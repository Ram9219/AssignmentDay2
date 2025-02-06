import java.util.*;

public class Question13 {
    public static boolean palindrome(String s){
StringBuilder str=new StringBuilder();
for(char c : s.toCharArray()){
    if(Character.isLetterOrDigit(c))
        str.append(Character.toLowerCase(c));
}
String or=str.toString();
String rev=str.reverse().toString();
return or.equals(rev);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word to check : ");
        String word=sc.nextLine();
        if(palindrome(word)){
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println("word " + word + " is not a palindrome");
        }
    }
}
