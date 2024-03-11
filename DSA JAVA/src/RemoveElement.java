public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElemnt(arr,2));
    }
    public static int removeElemnt(int[] nums, int val){
        int count=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==val){
                continue;
            }else
                nums[count]=nums[i];
                count++;

        }
        return count;
    }
}
