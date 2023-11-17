import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			int abs1 = Math.abs(o1);
			int abs2 = Math.abs(o2);
			
			return abs1 == abs2 ? Integer.compare(o1, o2) : Integer.compare(abs1, abs2);
		});
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
            
			if (n == 0)
				System.out.println(pq.size() != 0 ? pq.poll() : 0);
			else
				pq.add(n);
		}
	}
	
}