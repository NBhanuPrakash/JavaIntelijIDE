import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String patter = "abba", s="dog cat bat dog";
        System.out.println(wordPattern(patter,s));
    }
    public static boolean wordPattern(String pattern, String s){
        String[] words = s.split(" ");
        if (pattern.length()!=words.length){
            return false;
        }

        Map<Character,String> map = new HashMap<>();

        for (int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            boolean containsKey = map.containsKey(pattern.charAt(i));
            if (map.containsValue(words[i]) && !containsKey){
                return false;
            }
            if (containsKey && !map.get(ch).equals(words[i])){
                return false;
            }
            else{
                map.put(ch, words[i]);
            }
        }
        return true;
    }
}
