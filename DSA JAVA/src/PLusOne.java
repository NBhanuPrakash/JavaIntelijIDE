import java.util.Arrays;

public class PLusOne {

    public static void main(String[] args) {
        int []arr = {2,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        for (int i=n-1; i>=0; i--){
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newNumber = new int[n+1];
        newNumber[0]=1;
        return newNumber;
    }
}
