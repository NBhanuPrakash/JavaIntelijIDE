public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums){
        int sum=0;
        int max_Sum=nums[0];
        for (int num:nums) {
            sum+=num;
            if (sum>max_Sum){
                max_Sum=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return max_Sum;
    }
}
