import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int[] removeDuplicatesNum = Arrays.stream(arr).distinct().toArray();
        
        for (int i = 0; i < k; i++) {
            answer[i] = i < removeDuplicatesNum.length ? removeDuplicatesNum[i] : -1;
        }

        return answer;
    }
}
