import java.util.ArrayList;
import java.util.List;

public class PacalsTraiangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));

    }
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        if (numRows==0) return result;
        List<Integer> fistrow = new ArrayList<>();
        fistrow.add(1);
        result.add(fistrow);
        if (numRows==1) return result;

        for (int i=1; i<numRows; i++){
            List<Integer> prevRow = result.get(i-1);
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j=0; j<i-1; j++){
                row.add(prevRow.get(j)+prevRow.get(j+1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
