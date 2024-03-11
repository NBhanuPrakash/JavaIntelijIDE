public class FindMedian {
    public static void main(String[] args) {
        int[] nums1={2};
        int[] nums2={};
        System.out.println(findMedian(nums1,nums2));
    }
    public static double findMedian(int[] nums1, int[] nums2){

        if (nums2.length<nums1.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }


        int m =nums1.length;
        int n = nums2.length;

        int start=0;
        int end=m;
        while(start<=end) {
            int part1 = (start + end) / 2;
            int part2 = (m + n + 1) / 2 - part1;


            int maxLeftNums1 = (part1 == 0) ? Integer.MIN_VALUE : nums1[part1 - 1];
            int minrightnums1 = (part1 == m) ? Integer.MAX_VALUE : nums1[part1];
            int maxleftnums2 = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2 - 1];
            int minrightnums2 = (part2 == n) ? Integer.MAX_VALUE : nums2[part2];
            if (maxLeftNums1 <= minrightnums2 && maxleftnums2 <= minrightnums1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftNums1, maxleftnums2) + Math.min(minrightnums1, minrightnums2)) / 2.0;
                } else {
                    return (double) Math.max(maxLeftNums1, maxleftnums2);
                }
            } else if (maxLeftNums1 > minrightnums2) {
                end = part1 - 1;
            } else {
                start = part1 + 1;
            }


        }


        throw new IllegalArgumentException("No median found");
    }


}
