import java.util.Scanner;

public class perfectNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <end ; i++) {
            if (perfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean perfectNumber(int num) {
        int sum=0;

        for(int i=1;i<=num/2;i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum==num;
    }
}
