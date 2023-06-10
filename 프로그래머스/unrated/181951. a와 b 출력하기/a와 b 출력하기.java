import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "";
        str += sc.nextLine();
        
        sc.close();
        
        int a = Integer.parseInt(str.split("\\s+")[0]);
        int b = Integer.parseInt(str.split("\\s+")[1]);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}