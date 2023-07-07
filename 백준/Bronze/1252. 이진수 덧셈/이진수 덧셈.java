import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger b1 = sc.nextBigInteger();
        BigInteger b2 = sc.nextBigInteger();

        BigInteger a = new BigInteger(b1.toString(), 2);
        BigInteger b = new BigInteger(b2.toString(), 2);
        BigInteger sum = a.add(b);
        
        System.out.println(sum.toString(2));
    }
}