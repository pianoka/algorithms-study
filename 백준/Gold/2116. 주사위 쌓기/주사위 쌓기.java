import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        int[][] dice = new int[10001][7];
        int[] front = new int[] {0, 6, 4, 5, 2, 3, 1};
        
        int num = 0;
	    int ans = 0;
	    int sum = 0; 
	    int maxN = 0;
	    int idx = 0; 
	    int std = 0;
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
				
        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 1; j <= 6; j++) {
                dice[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 1; i <= 6; i++) {
		    sum = 0;	
		    maxN = 0;

		    for (int p = 1; p <= 6; p++) {
			    if (p != dice[1][i] && p != dice[1][front[i]]) {
				    maxN = Math.max(maxN, p);
			    }
		    }
		    
		    sum += maxN;
		    std = dice[1][i];
		
		    for (int j = 2; j <= n; j++) {
			    maxN = 0;
			    for (int x = 1; x <= 6; x++) {
				    if (dice[j][x] == std) {
					    idx = x;
					    break;
				    }
			    }
			    
			    int top = dice[j][front[idx]];
			    int bottom = std; 
			    
			    for (int k = 1; k <= 6; k++) {
				    if (k != top && k != bottom)
				        maxN = Math.max(maxN, k);  
			    }
			
			    sum += maxN;
			    std = top;
		    }
		
		    ans = Math.max(ans, sum);
		    sum = 0; 
    	}
    	
    	System.out.print(ans);
    }
}