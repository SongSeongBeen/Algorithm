import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]); // 새로값 추가
            if (priorityQueue.size() > k) {
                priorityQueue.poll(); // 최소값 제거
            }
            answer[i] = priorityQueue.peek();
        }

        return answer;
    }
}
