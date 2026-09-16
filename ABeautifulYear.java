import java.util.Scanner;

public class ABeautifulYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(true){
            n++;
            String s=String.valueOf(n);
            if( s.charAt(0) != s.charAt(1) &&
                s.charAt(0) != s.charAt(2) &&
                s.charAt(0) != s.charAt(3) &&
                s.charAt(1) != s.charAt(2) &&
                s.charAt(1) != s.charAt(3) &&
                s.charAt(2) != s.charAt(3) ){
                    System.out.println(n);
                    break;
                }
            sc.close();

        }

    }
}