import java.util.Scanner;

public class ACapsLock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word =sc.next();
        boolean changeCase = true;
        
        // Check if all characters from the second character onwards are uppercase
        for (int i = 1; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                changeCase = false;
                break;
            }
        }
        if (changeCase) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(Character.toUpperCase(ch));
                }
            }
            System.out.println(result.toString());
        } else {
            // Otherwise, leave the word unchanged
            System.out.println(word);
        }
        sc.close();
        
    }
}