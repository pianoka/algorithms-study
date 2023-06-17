import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (int i = 0; i < a.length(); i++) {
            char chr = a.charAt(i);
            
            if ((65 <= chr) && (chr <= 90)) 
                System.out.print((char) (chr + 32));
            else if ((97 <= chr) && (chr <= 122))
                System.out.print((char) (chr - 32));
            else
                System.out.print((char) chr);
        }
    }
}