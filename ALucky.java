import java.util.*;
public class ALucky{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            String s=sc.next();
            int lsum=0;
            int rsum=0;
            for(int i=0;i<3;i++){
                lsum+=s.charAt(i) -'0';
            }
            for(int i=3;i<6;i++){
                rsum+=s.charAt(i) -'0';
            }
            if(lsum==rsum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
      
    }
}