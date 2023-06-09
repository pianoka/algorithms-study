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
        int size = (int) (max - min);
        
        prime = new boolean[size + 1];
		isPrime(min, max);
		
		int result = 0;
		for (int i = 0; i <= size; i++) {
			if (!prime[i])
				result++;
		}
		
        System.out.println(result);
    }
    
	static void isPrime(long min, long max) {
		for (long i = 2; i <= Math.sqrt(max); i++) {
			long temp = i * i;
			long s = (min % temp == 0 ? min / temp : (min / temp) + 1);
			
			for (long j = s; j * temp <= max; j++)
				prime[(int) (j * temp - min)] = true;
		}
	}
}