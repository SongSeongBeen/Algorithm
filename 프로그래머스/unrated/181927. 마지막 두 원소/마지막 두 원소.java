import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int arrySize = num_list.length;
        int[] answer = Arrays.copyOf(num_list, arrySize + 1);
                
        // 마지막 배열 자리 채우기
        answer[arrySize] = (num_list[arrySize - 1] > num_list[arrySize - 2])
                ? num_list[arrySize - 1] - num_list[arrySize - 2]
                : num_list[arrySize - 1] * 2;

        return answer;
    }
}