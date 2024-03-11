public class ValiddPlinDrome {
    public static void main(String[] args) {
        String str ="race a car";
        System.out.println(isPlinDrome(str));
    }
    public static boolean isPlinDrome(String s){
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
