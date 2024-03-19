import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(arr[0]); // 첫 번째 요소를 큐에 추가

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                queue.offer(arr[i]); // 이전 요소와 다른 경우에만 큐에 추가
            }
        }

        int[] answer = new int[queue.size()];
        int index = 0;
        while (!queue.isEmpty()) {
            answer[index++] = queue.poll(); // 큐에서 요소를 제거하면서 배열에 저장
        }
        return answer;
    }
}