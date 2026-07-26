import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AWord59A{
    public static String word(String s){
        int upperCount = 0;
        int lowerCount = 0;
        byte[] asciiValues = s.getBytes(StandardCharsets.US_ASCII);
        for(int i : asciiValues){
            if(i>=97 && i<=122){
                    lowerCount++;
            }else{
                upperCount++;
            }
        }
        if(lowerCount>=upperCount){
            return s.toLowerCase();
        }
        else{
            return s.toUpperCase();
        }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input =  sc.nextLine();
        
        System.out.println(word(input));
        sc.close();
    }

}