import java.util.Scanner;

public class anagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if(word1.length()!=word2.length()){
            System.out.println("It is not a anagram");
        }
        else{
            char[] arr1 = word1.toCharArray();
            char[] arr2 = word2.toCharArray();
            boolean[] mark = new boolean[word2.length()];
            int count=word1.length();
            for (char c : arr1) {
                for (int j = 0; j < arr2.length; j++) {
                    if (c == arr2[j] && !mark[j]) {
                        count--;
                        mark[j] = true;
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("It is a anagram");
            }
            else{
                System.out.println("It is not a anagram");
            }
        }
    }
}
