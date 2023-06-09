import java.util.Scanner;

public class Main {
    
    static boolean[] prime;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "";
        str += sc.nextLine();
        
        sc.close();
        
        int N = Integer.parseInt(str.split("\\s+")[0]);
        int L = Integer.parseInt(str.split("\\s+")[1]);

        int t, x = -1, iter = -1;
        
        for (int i = L; i <= 100; i++) {
            t = (i - 1) * i / 2;
            if ((N - t) % i == 0 && (N - t) / i >= 0) {
                x = (N - t) / i;
                iter = i;
                break;
            }
        }
 
        if (x == -1) {
            System.out.print("-1");
        } else { 
            for (int i = 0; i < iter; i++) {
                System.out.print(x + i + " ");
            }
        }
    }
}
