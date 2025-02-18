import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char letter = sc.next().charAt(0);

        if (!Character.isLetter(letter)) {
            System.out.println("Invalid input! Please enter a letter.");
        }
        else if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' || letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U'){
            System.out.println("The given character is an vowel");
        }
        else{
            System.out.println("The given character is an consonant");
        }


    }
}
