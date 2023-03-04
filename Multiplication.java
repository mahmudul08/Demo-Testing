import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter your Columns: ");
        int cols = sc.nextInt();

        int num1 [][] = new int [rows][cols];
        int num2 [][] = new int [rows][cols];
        int Multiplication [][] = new int [rows][cols];

        int i, j;
        System.out.println("Enter your First array: ");
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                
                num1 [i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter your Second Array: ");
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                
                num2 [i][j] = sc.nextInt();
            }
        }
        
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                Multiplication[i][j] = num1[i][j] * num2[i][j];
            }
        }
        System.out.println("Total Multiplication of the array : ");
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                System.out.print(Multiplication[i][j] +" ");
            }
            System.out.println();
        }
    }
}
