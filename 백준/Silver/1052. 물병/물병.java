import java.util.Scanner;

public class Main {
    
    static boolean[] prime;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "";
        str += sc.nextLine();
        
        sc.close();
        
        int N = Integer.parseInt(str.split("\\s+")[0]);
        int K = Integer.parseInt(str.split("\\s+")[1]);

       	if (N <= K) {
		    System.out.print("0");
	    } else {
        	int result;
        
        	for (result = 0; ;result++) {
        		int cnt = 0;
        		int tempN = N;
        
        		while (tempN > 0) {
        			if (tempN % 2 > 0) {
        				cnt++;
        			}
        
        			tempN /= 2;
        		}
        
        		if (cnt <= K) {
        			break;
        		}
        
        		N++;
        	}
        
        	System.out.print(result);
	    }
    }
}