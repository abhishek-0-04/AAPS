import java.util.Scanner;

public class RangeSumUsingPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter L and R: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int rangeSum = prefix[r] - (l > 0 ? prefix[l-1] : 0);
            System.out.println("Sum from index " + l + " to " + r + " = " + rangeSum);
        }

        sc.close();
    }
}
