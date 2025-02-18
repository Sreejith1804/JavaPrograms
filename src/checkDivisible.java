import java.util.Scanner;

public class checkDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("This number is divisible both 5 and 3:");
        }
        else{
            System.out.println("The number is not divisible by 5 and 3");
        }
    }
}
