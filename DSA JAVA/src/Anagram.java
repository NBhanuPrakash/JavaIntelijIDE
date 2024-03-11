public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagram(s,t));
    }
    public static boolean anagram(String s, String t){
        int m = s.length()-1;
        int n = t.length()-1;
        int[] count = new int[26];
        if (m!=n){
            return false;
        }
        else{
            for (int i=0; i<m; i++){
                count[s.charAt(i)-'a']++;
            }
            for (int i=0; i<n; i++){
                count[t.charAt(i)-'a']--;
            }
            for (int j : count) {
                if (j != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
