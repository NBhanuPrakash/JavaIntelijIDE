public class MyAtoi {
    public static void main(String[] args) {
        String s = "4193 with words";
        System.out.println(myatoi(s));
    }
    public static int myatoi(String s){
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        if (i >= s.length()) {
            return 0;
        }
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '+') ? 1 : -1;
            i++;
        }

        if (i >= s.length()) {
            return 0;
        }

        int num = 0;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}
