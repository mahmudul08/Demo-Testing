import java.util.Scanner;

/**
 * additionTwoDimensionalArray
 */
public class addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nummber of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter Nummber of Columns : ");
        int cols = sc.nextInt();

        int num1[][] = new int [rows][cols];
        int num2[][] = new int [rows][cols];
        int addition[][] = new int [rows][cols];
        int i, j;


        //input 
        System.out.println("Enter your First Array : ");
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                num1 [i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter your Second Array : ");
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                num2 [i][j] = sc.nextInt();
            }
        }
        //Sum of two num
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                addition [i][j] = num1 [i][j] + num2 [i][j]; 
            }
        }
        //output
        System.out.println("Total Addition of the array : ");
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                System.out.print(addition[i][j] +" ");
            }
            System.out.println();
        }
 

    }
}
//"Enter sum of "+i + " " + j +"index" +" " + 