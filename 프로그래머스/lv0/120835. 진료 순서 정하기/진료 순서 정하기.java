import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        return Arrays.stream(emergency).map(x -> (int) Arrays.stream(emergency).filter(y -> y > x).count() + 1).toArray();
    }
}