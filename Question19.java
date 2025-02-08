import java.util.*;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        System.out.println("Enter the number of elements: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int second_max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]!=max && arr[i]>second_max){
                second_max=arr[i];
            }
        }
        System.out.println("Second max of the array is " + second_max);
    }
}
