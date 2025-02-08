import java.util.*;
public class Question21 {
    public static void  rotate(int arr[][]){
        int n=arr.length;

        // Transpose of the matrix 
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                // arr[i][j]^=arr[j][i];
                // arr[j][i]^=arr[i][j];This method is not good in java .--->>
                // arr[i][j]^=arr[j][i];
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //Reverse  the each row of the matrix ......
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                // arr[i][j]^=arr[i][n-j-1];
                // arr[i][n-j-1]*=arr[i][j];-->>>this is not appropriate for the java -->>
                // arr[i][j]^=arr[i][n-j-1];
                int temp=arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-j-1]=temp;
            }
        }
    }
    public static void print(int arr[][]){
        for(int [] i:arr){
            System.out.println(Arrays.toString(i));
        }
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter  size of the matrix : ");
    int n=sc.nextInt();
    int arr[][]=new int[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("Printing the original matrix ; ");
    print(arr);
    System.out.println("Printing the rotated 90 degree: ");
    rotate(arr);
    print(arr);
   } 
}
