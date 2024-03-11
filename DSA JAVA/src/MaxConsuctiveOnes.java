
public class MaxConsuctiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1};
        System.out.println(maxCOnsective(nums));
    }
    public static int maxCOnsective(int[] nums){
        int current_count = 0;
        int max_count =0;
        for (int num:nums) {
            if (num==1){
                current_count++;
                max_count=Math.max(max_count,current_count);
            }else{
                current_count=0;
            }
        }
        return max_count;
    }
}
