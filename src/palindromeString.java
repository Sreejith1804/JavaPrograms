import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word=word.trim();
        StringBuilder newWord = new StringBuilder();

        for(int i=word.length()-1;i>=0;i--){
            char ch = word.charAt(i);
            newWord.append(ch);
        }
        if(newWord.toString().equals(word)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
