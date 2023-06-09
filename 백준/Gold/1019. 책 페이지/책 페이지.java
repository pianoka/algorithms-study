import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int page = sc.nextInt();
        int[] ans = new int[10];
 
        int cur = page;
        for (int expr = 1; cur > 0; expr *= 10) {
            int idx = cur % 10;
            int next = cur / 10;
            ans[0] += next * expr;
            
            for (int i = 1; i <= idx; i++)
                ans[i] += (next + 1)*expr;
                
            ans[idx] -= expr - (page % expr) - 1;
            
            for (int i = idx + 1; i < 10; i++)
                ans[i] += next * expr;
     
            cur = next;
        }
        
        for (int i = 0; i < 10; i++)
            System.out.print(ans[i] + " ");
    }
}