import java.util.Scanner;

public class BQueueAtTheSchool{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        char[] s=sc.next().toCharArray();
        while(t-- >0){
            for(int i=0;i<s.length-1;i++){
                if(s[i] == 'B' && s[i+1] == 'G'){
                    s[i] = 'G';
                    s[i+1] = 'B';
                    i++;//skip the next as swap is done
                }
            }
            
        }
        System.out.println(s);

    }
}