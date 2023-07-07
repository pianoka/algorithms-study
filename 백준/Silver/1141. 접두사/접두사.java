import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] strArr = new String[n];
		
		for (int i = 0; i < n; i++) 
			strArr[i] = br.readLine();
			
        Arrays.sort(strArr, Comparator.comparingInt(String::length).reversed());
        
        List<String> resultArr = new ArrayList<String>();
        for (String str: strArr) {
            if (resultArr.size() == 0) {
                resultArr.add(str);
                continue;   
            }
            
    		boolean isNewStr = resultArr.stream().noneMatch(d -> d.indexOf(str) == 0);
            if (isNewStr) 
				resultArr.add(str);
        }
        
        System.out.println(resultArr.size());
    }
}