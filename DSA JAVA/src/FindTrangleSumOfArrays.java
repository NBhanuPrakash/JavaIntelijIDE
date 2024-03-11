public class FindTrangleSumOfArrays {
    public static void main(String[] args) {
        int [] arr = {5};
        System.out.println(trianglarsum(arr));
    }
    public static int trianglarsum(int[] nums){
        if (nums.length==1) return nums[0];
        int[] temp = getit(nums);
        return temp[0];
    }
    public static int[] getit(int[] a){
        if (a.length==1) return a;
        int[] b = new int[a.length-1];
        for (int i=0; i< a.length-1; i++)
            b[i]=(a[i]+a[i+1])%10;
        return getit(b);
    }
}
