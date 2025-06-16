import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class TwoSumProblem {
    
    public static void main(String[] args) {
        List<> arr = new List();
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,3,4,6,8,9,13));
        int target  = 13;

        System.out.println(Approach1(nums, target));
        System.out.println(Approach2(nums, target));

    }

    static boolean Approach1(List<Integer> nums, int target) {
        Set<Integer> set = new HashSet<>();
        for(Integer i: nums) {
            if(set.contains(target - i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    static boolean Approach2(List<Integer> nums, int target) {
        int left = 0, right = nums.size() - 1;
        while(left < right) {
            int num = nums.get(right) + nums.get(left);
            if(num == target)
                return true;
            else if( num > target)
                right--;
            else if( num < target)
                left++;
        }
        return false;
    }
}
