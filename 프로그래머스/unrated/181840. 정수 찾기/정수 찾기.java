import java.util.Arrays;

class Solution {
    public int solution(int[] num_list, int n) {
        boolean bolChk = Arrays.stream(num_list).anyMatch(i -> i == n);
        return bolChk == true ? 1 : 0;
    }
}