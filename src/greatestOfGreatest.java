import java.util.Scanner;

public class greatestOfGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a>=b && a>=c && a>=d){
            System.out.println("A is greatest");
        }
        else if(b>=a && b>=c && b>=d){
            System.out.println("B is greatest");
        }

        else if(c>=a && c>=b && c>=d){
            System.out.println("C is greatest");
        }

        else{
            System.out.println("D is greatest");
        }
    }
}
