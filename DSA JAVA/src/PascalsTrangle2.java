import java.util.ArrayList;
import java.util.List;

public class PascalsTrangle2 {
    public static void main(String[] args) {
        int n=1;
        System.out.println(getRow(n));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }

        return result.get(rowIndex);
    }
}
