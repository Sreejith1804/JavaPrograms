import java.util.Scanner;

public class fibbonaciInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <=end; i++) {
                System.out.print(find(i) + " ");
        }
    }

    public static int find(int num){
        if(num<=1){
            return num;
        }
        int first=0,second=1;
        for(int i=2;i<=num;i++){
            int temp=first+second;
            first=second;
            second=temp;
        }
        return second;
    }
}
