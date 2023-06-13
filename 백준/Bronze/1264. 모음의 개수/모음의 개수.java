import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if ("#".equals(str)) 
                break;
            
            
            str = str.toLowerCase();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                        count++;
                    default: 
                        break;
                }
            }
            
            System.out.println(count);
        }
    }
}