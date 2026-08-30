import java.util.Scanner;

public class AFootball{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        int count0=0;
        int count1=0;
        for(char ch:s.toCharArray()){
  
            if(ch == '1'){
                count1++;
                count0=0;

            }
            if(ch == '0'){
                count0++;
                count1=0;

            }
            if(count0 >= 7 || count1>=7){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        
        
        
        sc.close();
    }
}