public class ReverseWordsOfStrings {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s){
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<words.length; i++){
            StringBuilder sb1 = new StringBuilder(words[i]);
            sb1.reverse();
            sb.append(sb1);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
