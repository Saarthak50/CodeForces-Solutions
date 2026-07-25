import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String word = sc.nextLine();
        String char1 = word.substring(0,1);
        String rest = word.substring(1);
        System.out.println(char1.toUpperCase()+rest);
        sc.close();

    }
}
