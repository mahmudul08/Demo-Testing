import java.util.Scanner;

public class primeNumber {
    public static boolean isPrime(int numbers){
        if(numbers <= 1){
            return false;
        }
        for(int i = 2; i <= numbers / 2; i++){
            if(numbers % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int numbers = sc.nextInt();
        for(int i = 5; i <= numbers; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    
    }
}

