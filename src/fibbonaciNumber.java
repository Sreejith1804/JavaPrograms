import java.util.Scanner;

public class fibbonaciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        for(int i=0;i<end;i++) {
            System.out.print(fibbonaci(i)+" ");
        }
    }
    public static int fibbonaci(int n){
        if(n<=1){
            return n;
        }
        return fibbonaci(n-1)+fibbonaci(n-2);
    }
}
