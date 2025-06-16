import java.util.*;

class LinearSearch {
    

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.print("Please enter a key to search: ");
        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();
        boolean found = false;
        for(int i : arr) {
            if (i == key) {
                System.out.println("Found Key");
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("Key not found");
        }
}