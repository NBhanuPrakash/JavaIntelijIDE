public class SearchInsertPostion {
    public static void main(String[] args) {
        int []arr = {1,3,5,6};
        System.out.println(searchelement(arr,-1));
    }
    public static int searchelement(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                end=mid-1;
            }else if (nums[mid]<target){
                start=mid+1;
            }
        }
        return start;
    }
}
