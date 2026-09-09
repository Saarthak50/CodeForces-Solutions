import java.util.Scanner;

public class AVanyaAndFence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//no of friends
        int h=sc.nextInt(); 
        int count=0;// heightoffence
        while(n-- >0){
           
            int a=sc.nextInt();
            if(a<=h){
                count++;
            }
            else if(a>h){
                count+=2;
            }
        }
        System.out.println(count);
        
    }
}