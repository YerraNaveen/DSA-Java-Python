import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4};
        System.out.print("Please enter a key to search: ");
        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();
        int  i = 0, j = arr.length - 1, mid;
        boolean flag = false;
        while(i <= j) {
            mid = (i + j) / 2;
            if(key == arr[mid]) {
                System.out.println("Key Found");
                flag = true;
                break;
            } 
            if(arr[mid] < key)
                i = mid + 1;
            else if(arr[mid] > key)
                j = mid;
        }
        if(!flag)
            System.out.println("Key not found");
    }
    
}
