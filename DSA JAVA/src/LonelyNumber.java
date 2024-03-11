import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyNumber {
    public static void main(String[] args) {
        int[] arr = {404,198,838,598,423,505,350,432,772,408,28,56,939,191,324,797,229,160,183,487,264,983,620,842,702,875,454,835,863,302,269,120,619,131,547,705,514,153,130,326,350,142,211,888,126,575,410,722,175,219,872,831,596,901,275,974,593,130,123,229,814,240,88,0,934,60,116,66,552,396,563,423,798,989,345,960,169,37,998,447,857,923,286,813,92,797,5,46,257,244,910,135,147,574,316,448,827,626,251,189,476,595,137,445,67,850,140,365,574,623,952,469,970,664,54,730,130,854,863,121,152,324,514,57,350,490,369,619,973,427,50,334,124,563,646,172,545,665,223,848,7,527,472,841,741,597,789,137,414,307,71,120,644,799,406,257,375,671,7,246,901,364,803,43,983,146,845,758,201,149,514,437,932,971,455,688,25,402,118,613,217,946,220,476,345,349,307,487,701,71,324,0,438,839,525,506,599,986,271,590,237,499,458,720,520,482,632,624,61,752,16,809,267,779,920,813,266,411,619,533,773,664,439,98,71,624,691,741,111,324,932,643,621,822,857,334,931,55,14,213,555,447,683,724,807,364,186,445,740,447,275,350,621,936,777,857,938,715};
        System.out.println(findLonely(arr));
    }
    public static List<Integer> findLonely(int[] nums){
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1 && !map.containsKey(num + 1) && !map.containsKey(num - 1)) {
                list.add(num);
            }
        }
        return list;
    }
}