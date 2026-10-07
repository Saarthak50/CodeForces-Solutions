import java.util.*;
public class AHq9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(char ch:s.toCharArray()){
            if(ch == 'H' || ch == 'Q' || ch=='9' || ch =='+'){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        
        
        sc.close();
    }
}