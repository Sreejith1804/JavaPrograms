import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp=num,rev=0;
        while(temp>0){
            int lastDigit = temp%10;
            rev = (rev*10)+lastDigit;
            temp/=10;
        }

        if(rev==num){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
