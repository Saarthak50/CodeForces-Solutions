import java.util.Scanner;

public class AAntonAndDanik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s =sc.next();
        int Acount =0 ;
        int Dcount =0 ;
        for(char ch:s.toCharArray()){
            if(ch == 'A'){
                Acount++;
            }else if(ch =='D'){
                Dcount++;
            }
        }
        if(Acount>Dcount){
            System.out.println("Anton");
        }else if(Acount == Dcount){
            System.out.println("Friendship");
        }else if(Dcount>Acount){
            System.out.println("Danik");
        }

    }
}