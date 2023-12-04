import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Integer[] indices = new Integer[rank.length];
        for (int i = 0; i < rank.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, Comparator.comparingInt(i -> rank[i]));

        int[] pick = new int[3];
        int index = 0;
        for (int i : indices) {
            if (attendance[i] && index < 3) {
                pick[index++] = i;
            }
        }

        int answer = 10000 * pick[0] + 100 * pick[1] + pick[2];
        return answer;
    }
}
