import java.util.Arrays;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row vales");
        int row =sc.nextInt();
        System.out.println("Enter  coulumn");
        int col=sc.nextInt();
        System.out.println("enter value in arrays");
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("arrays elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
             System.out.print(arr[i][j]+ " ");

            }
        System.out.println();
        }
    }

}
