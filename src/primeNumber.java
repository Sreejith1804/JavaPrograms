import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0 && num>1){
            System.out.println("The number is a prime");
        }
        else{
            System.out.println("The number is not a prime");
        }
    }
}
