import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "";
        str += sc.nextLine();
        
        sc.close();
        
        int a = Integer.parseInt(str.split("\\s+")[0]);
        int b = Integer.parseInt(str.split("\\s+")[1]);
        int c = Integer.parseInt(str.split("\\s+")[2]);
        
        System.out.print(pow(a, b, c));
    }
    
    public static long pow(int a, int b, int c) {
        if (b == 0)
            return 1;
        
        long n = pow(a, b/2, c);
        if (b % 2 == 0)
            return n * n % c;
        else  
            return n * n % c * a % c;
     }
}