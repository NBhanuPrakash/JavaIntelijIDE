public class ThirdMax {
    public static void main(String[] args) {
        int[] nums = {2,4,3,1};
        System.out.println(thirdmax(nums));
    }
    public static int thirdmax(int[] nums){
        long first = Long.MIN_VALUE;
        long secound = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (final int num:nums) {
            if (num>first){
                third=secound;
                secound=first;
                first=num;
            }else if (first>num && num>secound){
                third=secound;
                secound=num;
            }else if (secound>num && num>third){
                third=num;
            }
        }
        return (third==Long.MIN_VALUE)?(int) first:(int) third;
    }
}
