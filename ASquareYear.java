import java.util.*;

public class ASquareYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            String s=sc.next();
            int year = Integer.parseInt(s);
            // if no is perfect square then yess
            int root = (int) Math.sqrt(year);
            if(root * root == year){
                System.out.println("0 " + root);
            }else{
                System.out.println("-1");
            }
        }
    }
}