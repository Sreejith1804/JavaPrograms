import java.util.Scanner;

public class allLeapYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startYear = sc.nextInt();
        int endYear = sc.nextInt();
        for (int i = startYear; i <=endYear ; i++) {
            if(check(i)){
                System.out.print(i+" ");
            }
        }

    }
    public static boolean check(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
