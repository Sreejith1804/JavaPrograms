import java.util.Scanner;

public class automorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp=num,digit=0;
        while (temp!=0){
            temp/=10;
            digit++;
        }
        int square = num*num;
        int divisor=1;
        for(int i=0;i<digit;i++){
            divisor*=10;
        }
        int check = square%divisor;
        if(check==num){
            System.out.println("It is a automorphic number");
        }
        else{
            System.out.println("It is not a automorphic number");
        }
    }
}
