import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int maxsum=Integer.MIN_VALUE;
        int maxRowSum=-1;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            if(sum>maxsum){
                maxsum=sum;
                maxRowSum=i+1;
            }
            // 3 4 1 2 3 4 5 6 7 8 9 11 12
        }
        System.out.println("Row with max sum : "+maxRowSum);
        System.out.println("Maximum sum : "+maxsum);

    }
}
