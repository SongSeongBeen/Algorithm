import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
        for(int i = 0; i < num_list.length; i += n){
            answer[index++] = num_list[i];
        }
        return Arrays.copyOf(answer, index);
    }
}