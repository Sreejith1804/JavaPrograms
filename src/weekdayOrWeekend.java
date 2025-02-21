import java.util.Objects;
import java.util.Scanner;

public class weekdayOrWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        System.out.println(check(day));


    }

    public static String check(String day){
        day = day.toLowerCase();
        if(Objects.equals(day, "monday") || Objects.equals(day, "tuesday") || Objects.equals(day, "wednesday") || Objects.equals(day, "thursday") || Objects.equals(day, "friday")){
            return "Weekday";
        }
        return "Weekend";
    }
}
