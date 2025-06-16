public class PrefixSums {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9};

        int[] prefixSums = new int[arr.length];
        prefixSums[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            prefixSums[i]  = prefixSums[i - 1] + arr[i];
        }

        for (int prefix : prefixSums) {
            System.out.println(prefix);
        };

    }
    
}
