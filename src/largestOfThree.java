import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("A is greatest");
        }
        else if(b>=a && b>=c){
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C is greatest");
        }
    }
}
