import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact=1;

        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial:"+fact);
        System.out.println("Factorial(using recursion):"+factNum(num));
    }

    public static int factNum(int n){
        if(n==0){
            return 1;
        }
        return n * factNum(n-1);
    }
}
