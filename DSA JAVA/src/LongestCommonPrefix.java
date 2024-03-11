import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"","b"};
        System.out.println(longestCommonprefix(str));
    }
    public static String longestCommonprefix(String[] str){

        Arrays.sort(str);
        String str1 = str[0];
        String str2 = str[str.length-1];
        int index=0;

        while(index<str2.length() && index<str1.length() && str1.charAt(index)==str2.charAt(index)){
                index++;
        }
        return index==0?"":str1.substring(0,index);
    }
}

