public class Anagrams {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "cbada";

        int[] count = new int[26];

        for(char c : s.toCharArray()) 
            count[c - 'a']++;
        boolean flag = false;
        for(char c : t.toCharArray()) {
            if(--count[c - 'a'] < 0) {
                System.out.println("Not Anagrams");
                flag = true;
                break;
            }
        }

        if(!flag)
            System.out.println("Anagrams");
    }
    
}
