import java.util.HashSet;
import java.util.Set;

public class LongestPalinDrome {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(longestPlindrome(s));
    }
    public static int longestPlindrome(String s){
        Set<Character> set = new HashSet<>();
        int count=0;
        for (char c:s.toCharArray()) {
            if (set.contains(c)){
                count+=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        return set.size()>0?count+1:count;
    }
}
