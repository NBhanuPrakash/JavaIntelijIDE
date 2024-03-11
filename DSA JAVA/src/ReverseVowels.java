import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s){
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        char[] ch = s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if (!vowels.contains(ch[start])){
                start++;
            }else if (!vowels.contains(ch[end])){
                end--;
            }else{
                char temp = ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

}
