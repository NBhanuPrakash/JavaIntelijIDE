public class ReverseInteger {
    public static void main(String[] args){
        int rev = -8;
        System.out.println(reverse(rev));
    }
    public static int reverse(int x){
        int rev=0;
        while(x!=0){
            int sum=x%10;
            if (rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=rev*10+sum;
            x/=10;
        }
        return rev;
    }
}
