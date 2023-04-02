import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = Arrays.stream(score)
                                        .mapToInt(t -> t[0] + t[1])
                                        .boxed()
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toList());

        int[] answer = Arrays.stream(score)
                             .mapToInt(t -> scoreList.indexOf(t[0] + t[1]) + 1)
                             .toArray();
        return answer;
    }
}