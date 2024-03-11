import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n=1;
        System.out.println(happyNumber(n));
    }
    public static boolean happyNumber(int n){
        Set<Integer> has = new HashSet<>();
        int sum=0;
        while(sum!=1 && !has.contains(sum)){
            has.add(sum);
            sum=0;
            while (n!=0){
                sum+=Math.pow(n%10,2);
                n/=10;
            }
            n=sum;
        }
        return sum==1;
    }
}
