import java.util.Scanner;

public class smallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<=b && a<=c){
            System.out.println("A is smallest");
        }
        else if(b<=a && b<=c){
            System.out.println("B is smallest");
        }
        else{
            System.out.println("C is smallest");
        }
    }
}
