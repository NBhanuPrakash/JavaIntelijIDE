public class LengthOfWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(lengthofword(str));
    }
    public static int lengthofword(String s){
        String trim =s.trim();
        System.out.println(trim);
        int count =0;
        for (int i=trim.length()-1; i>=0; i--){
            if (trim.charAt(i)==' '){
                break;
            } count++;
        }
        return count;
    }
}
