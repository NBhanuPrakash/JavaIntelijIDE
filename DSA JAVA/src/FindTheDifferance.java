public class FindTheDifferance {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        System.out.println(differncebetChar(s,t));
    }
    public static char differncebetChar(String s, String t){
        int total =0;
        for (int i=0; i<s.length(); i++){
            total^=s.charAt(i);
        }
        for (int i=0; i<t.length(); i++){
            total^=t.charAt(i);
        }
        return (char) total;
    }
}
