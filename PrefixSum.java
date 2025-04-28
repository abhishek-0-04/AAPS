public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1};
        int n = arr.length;

        
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        
        int left = 1, right = 3;
        int rangeSum = prefix[right] - (left > 0 ? prefix[left - 1] : 0);

        System.out.println("Sum from index " + left + " to " + right + " is: " + rangeSum);
    }
}
