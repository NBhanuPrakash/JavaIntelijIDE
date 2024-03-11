import java.util.HashSet;
import java.util.Set;

public class COntainsDUplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int []nums){
        Set<Integer> set = new HashSet<>();
        for (int setnums : nums){
            if (!set.add(setnums)){
                return true;
            }
        }
        return false;
    }
}
