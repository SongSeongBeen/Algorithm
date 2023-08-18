import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int j = 0; j < queries.length; j++) {
            int threshold = queries[j][2];            
            int minVal = Integer.MAX_VALUE;
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                if (arr[i] > threshold) {
                    minVal = Math.min(minVal, arr[i]);
                }
            }
            
            answer[j] = (minVal == Integer.MAX_VALUE) ? -1 : minVal;
        }
        
        return answer;
    }
}
