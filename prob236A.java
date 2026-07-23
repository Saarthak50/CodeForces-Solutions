import java.util.Scanner;

public class prob236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;

        }
        int unique = 0;
        for(int x : freq){
            if(x > 0){
                unique++;
            }
        }
        if(unique%2 == 0){
            System.out.println("CHAT WITH HER!");

        }else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();

    }
}
