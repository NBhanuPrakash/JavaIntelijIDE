public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countandSay(5));
    }
    public static String countandSay(int n){
        String val="1";
        for (int i=0; i<n-1; i++){
            char c = val.charAt(0);
            StringBuilder sb = new StringBuilder();
            int count=1;

            for (int j=1; j<val.length(); j++){
                if (c!=val.charAt(j)){
                    sb.append(count).append(c);
                    count=0;
                    c=val.charAt(j);
                }
                count++;
            }
            sb.append(count).append(c);
            val= sb.toString();
        }
        return val;
    }
}
