public class AddTwoDigits {
    public static void main(String[] args) {
        int n=1256;
        System.out.println(addTwoDigits(n));
    }
    public static int addTwoDigits(int n){
        if (n==0){
            return 0;
        }
//        return (n == 0) ? 0 : (n % 9 == 0 ? 9 : n % 9);
        return (n%9==0?9:n%9);
    }
}
