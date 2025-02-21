import java.util.Scanner;

public class checkDivisible2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%7==0 && num%11==0){
            System.out.println("This number is divisible both 7 and 11:");
        }
        else{
            System.out.println("The number is not divisible by 7 and 11");
        }
    }
}
