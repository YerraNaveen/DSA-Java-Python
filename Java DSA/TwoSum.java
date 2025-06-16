import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 4, 3,1, 3,5, 5,2 , 4};

        int target = 5;
        HashSet<Integer> set =  new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for(int num : nums){
            int sub = target - num;

            if(set.contains(sub)) {
                pairs.add(new int[] {sub, num});
            }

            set.add(sub);
        }
        pairs.forEach(pair -> System.out.println("(" + pair[0] + " ," + pair[1] + ")"));
    } 
}
