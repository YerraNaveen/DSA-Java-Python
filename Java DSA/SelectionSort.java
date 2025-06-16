public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 3, 5, 7, 9, 8};
        int n = arr.length;

        for(int i=0; i < n -1; i++){
            int k = i;
            for(int j=i; j<n-1; j++) {
                if(arr[j] < arr[k]){
                    k = j;
                }
            }
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
        }
            
        for(int i : arr)
            System.out.print(i + " - ");
    }
    
}
    