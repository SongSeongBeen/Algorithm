import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int[] command = commands[i];
            int start = command[0] - 1; // 시작 인덱스는 0부터 시작하므로 1을 뺌
            int end = command[1];       // 끝 인덱스는 포함하지 않으므로 그대로
            int k = command[2] - 1;     // k번째 수를 구하기 위해 1을 뺌

            int[] temp = new int[end - start];
            System.arraycopy(array, start, temp, 0, temp.length);

            Arrays.sort(temp);

            answer[i] = temp[k];
        }

        return answer;
    }
}