import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            System.out.println("It is not a perfect square");
        }
        else {
            int flag=0;
            while(flag*flag<num){
                flag++;
            }

            if(flag*flag==num){
                System.out.println("It is a perfect square");
            }
            else{
                System.out.println("It is not a perfect square");
            }
        }
    }
}
