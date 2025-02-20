import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int LCM = a*b/GCD(a,b);
        System.out.printf("The lcm of %d and %d = %d",a,b,LCM);
        System.out.println();
        System.out.printf("The gcd of %d and %d = %d",a,b,GCD(a,b));
    }

    public static int GCD(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

}
