import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original=num;
        int flag=num;
        int count=0,sum=0;
        while (num!=0){
            num/=10;
            count++;
        }
        while (flag!=0){
            int last = flag%10;
            sum+=(int) Math.pow(last,count);
            flag/=10;
        }
        if(original==sum){
            System.out.println("It is a armstrong number");
        }
        else{
            System.out.println("It is not a armstrong number");
        }

    }
}
