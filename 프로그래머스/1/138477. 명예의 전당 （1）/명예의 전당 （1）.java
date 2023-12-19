import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                minHeap.add(score[i]);
            } else {
                if (score[i] > minHeap.peek()) {
                    minHeap.poll(); // 최소값 제거
                    minHeap.add(score[i]); // 새로값 추가
                }
            }
            answer[i] = minHeap.peek();
        }

        return answer;
    }
}
