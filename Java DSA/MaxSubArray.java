public class MaxSubArray {

    public static int maxSubArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] + max > max)
                max = arr[i] + max;
            else if(arr[i] > max )
                max = arr[i];
        }
        return max;
    }

    public static int maxSubArrayK(int[] arr, int k) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        maxSum = sum;
        for(int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if(sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }

    public static int minSubArraySize(int[] arr, int target) {

        //Brute force
        int minLength = arr.length, sum;
        for(int i = 0; i < arr.length; i++) {
            sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum >= target) {
                    minLength = minLength > j - i + 1? j - i + 1: minLength;
                    break;
                }
            }
        }
        return minLength;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};

        // System.out.println(maxSubArray(arr));

        // System.out.println(maxSubArrayK(arr, 3));

        System.out.println(minSubArraySize(arr, 6));
    }
    
}
