public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s){
        String[] str = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i= str.length-1; i>=0; i--){
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
