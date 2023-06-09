import java.util.Scanner;

public class Main {
    
    static boolean[] prime;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "";
        str += sc.nextLine();
        
        sc.close();
        
        long min = Long.parseLong(str.split("\\s+")[0]);
        long max = Long.parseLong(str.split("\\s+")[1]);

        System.out.println(sum(max) - sum(min-1));
    }
    
	static long sum(long n) {
        if (n <= 0) 
            return 0;
          
        long[] c = new long[10];
        long s = 1;
        long sum = 0;
        long t = 0;
        long r = 0;
        
        while (n > 0) {
            t = n / (s * 10);
            r = n % (s * 10);
            
            for (int i = 0; i < 10; i++) 
                c[i] += t * s;
            
            for (int i = 1; i <= r / s; i++) 
                c[i] += s;
            
            c[(int) (r / s + 1) % 10] += r % s;
            n -= 9 * s;
            s *= 10;
        }
        
        for (int i = 1; i < 10; i++) 
            sum += i * c[i];
        
        return sum;
	}
}
