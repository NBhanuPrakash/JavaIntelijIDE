public class ReverseCharcters {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println(reverseChar(s));
    }
    public static char[] reverseChar(char[] s){
        int left =0;
        int right=s.length-1;

        while (left<right){
           char temp=s[left];
            s[left++]=s[right];
            s[right--]=temp;
        }
        return s;
    }
}
