public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 3, 5, 7, 9, 8};
        int n = arr.length;
        for(int i=0; i < n -1; i++)
            for(int j=0; j<n-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        for(int i : arr)
            System.out.print(i + " - ");
    }
}
