import java.util.Arrays;

class Solution {
    public int solution(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) >= 0 ? 0 : 1;
    }
}
