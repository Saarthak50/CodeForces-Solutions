import java.util.Scanner;

public class AMagnets {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;

        String prev = sc.next();
        int i = 1;

        while (i < n) {
            String curr = sc.next();

            if (!prev.equals(curr)) {
                count++;
            }

            prev = curr;
            i++;
        }

        System.out.println(count);
    } 
}
