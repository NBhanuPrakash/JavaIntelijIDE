import java.util.HashMap;
import java.util.Map;

public class FindLuckyInteger {
    public static void main(String[] args) {
        int[] arr = {19,12,11,14,18,8,6,6,13,9,8,3,10,10,1,10,5,12,13,13,9};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int x=0;
        int max=-1;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getKey()==entry.getValue()){
                x=entry.getValue();
                max=Math.max(x,max);
            }
        }
        return max;
    }

}
