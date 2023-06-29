import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
        int[] wine = new int[num];
        int[] d = new int[num];
		
		for (int i = 0; i < num; i++) 
		    wine[i] = sc.nextInt();
		
		d[0] = wine[0];
		
		if (num > 1)
		    d[1] = wine[0] + wine[1];
		if (num > 2)
		    d[2] = Math.max(Math.max(wine[2] + wine[1], wine[2] + wine[0]), d[1]);
		    
		for (int i = 3; i < num; i++)
		    d[i] = Math.max(d[i-1], Math.max(d[i-3] + wine[i-1] + wine[i], d[i-2] + wine[i]));
		    
		System.out.print(d[num-1]);
    }
    
}