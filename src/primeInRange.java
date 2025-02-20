import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <num; i++) {
            if (prime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean prime(int n) {

        if (n<=1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
