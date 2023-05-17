import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> resultList = new ArrayList<>();
        int prev = -1;
        for (int num : arr) {
            if (num != prev) {
                resultList.add(num);
                prev = num;
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}