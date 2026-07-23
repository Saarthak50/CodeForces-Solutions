import java.util.ArrayList;
import java.util.Scanner;

public class prob1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //test cases //number
        while(t-- > 0 ){
            int n = sc.nextInt();
            ArrayList<Integer> ans = new ArrayList<>();
            int place = 1;
            while(n > 0){
                int digit = n %10;
                if(digit != 0 ){
                    ans.add(digit*place);
                }
                place *=10;
                n/=10;
            }
            System.out.println(ans.size());
            for(int i=0;i<ans.size();i++){
                System.out.println(" "+ans.get(i) );
            }
        }
        sc.close();
        
        
        

    }
}
