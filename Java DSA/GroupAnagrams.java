import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"aba", "aab", "bdd", "ddb"};

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedStr = new String(arr);

            map.computeIfAbsent(sortedStr, E -> new ArrayList<String>()).add(str);
        }
        System.out.println(map.values());
    }
    
}
