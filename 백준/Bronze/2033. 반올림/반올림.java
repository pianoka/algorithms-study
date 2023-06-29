import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int comp = 10;
		while (num > comp) {
		    int numModComp = num % comp;
		    
		    if ((numModComp * 10 / comp) >= 5)
		        num += comp;
		        
		    num -= numModComp;
		    comp *= 10;
		}
		
		System.out.print(num);
    }
}