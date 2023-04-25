import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        // 가장 작은 수 찾기
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int count = 0;

        // 가장 작은 수가 몇 개인지 찾기
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min) {
                count++;
            }
        }

        // 가장 작은 수를 제외한 나머지 수들로 새로운 배열 생성
        int[] answer = new int[arr.length - count];
        for(int i=0, j=0; i<arr.length; i++) {
            if(arr[i] != min) {
                answer[j++] = arr[i];
            }
        }
        // 새로운 배열이 비어있다면 -1이 들어있는 배열 생성
        if(answer.length == 0) {
            answer = new int[]{-1};
        }

        return answer;
    }
}