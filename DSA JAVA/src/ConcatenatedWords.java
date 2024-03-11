import java.util.*;

public class ConcatenatedWords {
    public static void main(String[] args) {
        String[] str = {"ca","t","dog","catdog"};
        System.out.println(concatenated(str));
    }
    public static List<String> concatenated(String[] words){
        Map<String,Boolean> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        Collections.addAll(set, words);
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (isConcatenated(word, set, map)) {
                list.add(word);
            }
        }
        return list;

    }
    public static boolean isConcatenated(String word,Set<String> str,Map<String,Boolean> map){
        if (map.containsKey(word)){
            return map.get(word);
        }
        for (int i=0; i<word.length(); i++){
            String prefix = word.substring(0,i+1);
            String sufix = word.substring(i+1);
            if (str.contains(prefix) && str.contains(sufix) || str.contains(prefix) && isConcatenated(sufix,str,map)){
                map.put(word,true);
                return true;
            }
        }
        map.put(word,false);
        return false;
    }
}
