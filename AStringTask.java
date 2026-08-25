import java.util.Scanner;

public class AStringTask{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ansS = new StringBuilder("");
        s= s.toLowerCase();
        for(char ch:s.toCharArray()){
            if(ch != 'a' && ch != 'e' && ch != 'i'&& ch != 'o' && ch != 'u' && ch != 'y'){
                ansS.append('.');
                ansS.append(ch);
                

            }

        }
        System.out.println(ansS.toString());
    }
}