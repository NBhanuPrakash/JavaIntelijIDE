public class ReverseString {
    public static void main(String[] args) {
        String word="the sky is blue";
        System.out.println(reverseString(word));
    }
    public static String reverseString(String str){
        StringBuilder word = new StringBuilder(str);
        word.reverse();
        return word.toString();
    }
}
