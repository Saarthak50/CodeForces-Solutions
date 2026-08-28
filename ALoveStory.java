import java.util.Scanner;

public class ALoveStory{
    //taimur pblm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            String s = sc.next();
            //codeforces
            int indices = 0;
            if(s.charAt(0) != 'c') indices++; 
            if(s.charAt(1) != 'o') indices++;
            if(s.charAt(2) != 'd')indices++;
            if(s.charAt(3) != 'e')indices++;
            if(s.charAt(4) != 'f')indices++;
            if(s.charAt(5) != 'o') indices++;
            if(s.charAt(6) != 'r') indices++;
            if(s.charAt(7) != 'c') indices++;
            if(s.charAt(8) != 'e') indices++;
            if(s.charAt(9) != 's') indices++;
           
            System.out.println(indices);

            /*
             String target = "codeforces";

            int count = 0;

            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    count++;
                }
            }
 */

        }
    }
}