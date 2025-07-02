// Finding the largest sum of any two distinct values from an array
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for(int k : a){
                if(k>max1){
                    max2=max1;
                    max1=k;
                }
                else if(k>max2){
                    max2=k;
                }
            }
            System.out.println(max1+max2);
        }
        
    }
}
