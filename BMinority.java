import  java.util.*;
public class BMinority{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            int zeros=0;
            int ones=0;
            for(char ch:s.toCharArray()){
                if( ch == '0'){
                    zeros++;
                }
                else{
                    ones++;
                }
            }
            if(zeros == ones){
                System.out.println(0);

            }else if(zeros>ones){
                System.out.println(ones);
            }else if(zeros<ones){
                System.out.println(zeros);
            }
        }

    }
}