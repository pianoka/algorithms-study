import java.awt.*;
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Element[] A = new Element[n + 1];
        
        for (int i = 1; i < n + 1; i++)
            A[i] = new Element(Integer.parseInt(br.readLine()), i);
        
        Arrays.sort(A, 1, n + 1);

        int max = 0;
        for (int i = 1; i < n + 1; i++) 
            max = Math.max(max, A[i].idx - i);

        bw.write((max + 1) + "\n");
        bw.flush();
    }

    private static class Element implements Comparable<Element> {
        int num;
        int idx;

        public Element(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Element o) {
            return num - o.num;
        }
    }
    
}