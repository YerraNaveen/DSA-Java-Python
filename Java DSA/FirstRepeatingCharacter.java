import java.util.HashMap;

public class FirstRepeatingCharacter {

    public static Object findFirstRepeatingCharacter(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) 
                return c;
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return -1;

    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(findFirstRepeatingCharacter(s));
    }
    
}