import java.util.Arrays;

public class MergeSort {


    static void mergeSort(int[] arr) {
        if(arr.length <= 1) return;

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j])? left[i++] : right[j++];
        }

        while(i < left.length)
            arr[k++] = left[i++];
        while(j < right.length)
            arr[k++] = right[j++];
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 2, 2, 3, 5, 7, 9, 8};

        mergeSort(arr);
        for(int i : arr)
        System.out.print(i + " - ");
        
    }
    
}
