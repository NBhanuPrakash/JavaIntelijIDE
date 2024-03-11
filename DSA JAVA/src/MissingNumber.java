public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums){
        int sum=0;
        for (int num : nums) {
            sum = sum + num;
        }
        int actualSum= (nums.length*(nums.length+1))/2;
        return actualSum-sum;
    }
}
