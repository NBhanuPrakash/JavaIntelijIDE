public class PowerOfNumber {
    public static void main(String[] arg){
        int num = 15;
        System.out.println(powerNum(num));
    }
    public static boolean powerNum(int n){
        if (n<=0){
            return false;
        }
        while (n>1){
            if (n%2==1){
                return false;
            }else {
                n/=2;
            }
        }
        return true;
    }
}
