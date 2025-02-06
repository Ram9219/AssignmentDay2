import java.util.*;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row1 of matrix: ");
        int r1=sc.nextInt();
        System.out.println("Enter the column1 of matrix: ");
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the row2 of matrix: ");
        int r2=sc.nextInt();
        System.out.println("Enter the column2 of matrix: ");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int result[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                result[i][j]=0;
                for(int k=0;k<c1;k++){
                    result[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
