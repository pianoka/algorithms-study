import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[9];
        int maxNum = arr[0];
        int maxIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
            if (maxNum < arr[i]) {
                maxNum = arr[i];
                maxIdx = i + 1;
            }
        }
        
        System.out.println(maxNum);
        System.out.println(maxIdx);
    }
}