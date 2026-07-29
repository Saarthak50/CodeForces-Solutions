
import java.util.Scanner;

public class ATranslation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t =sc.next();
        StringBuilder revS = new StringBuilder(t);
        if(s.equals(revS.reverse().toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}