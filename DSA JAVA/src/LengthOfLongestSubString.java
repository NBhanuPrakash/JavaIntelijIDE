import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String s = "hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        System.out.println(subString(s));
    }
    public static int subString(String s){
        int start =0, end =0, max_len=0;
        List<Character> list = new ArrayList<>();
        while (end<s.length()){
            if (!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_len=Math.max(max_len, list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_len;
    }
}
