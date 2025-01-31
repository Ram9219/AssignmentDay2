import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a Line :");
        String s=sc.nextLine();
        String str[]=s.split("\\s+");
        String l=" ";
        for(String word : str) {
            if(word.length()>l.length()){
                l=word;
            }
        }
        System.out.println("Longest word is : " + l);

    }
}
