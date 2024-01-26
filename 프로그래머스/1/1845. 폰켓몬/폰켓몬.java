import java.util.Arrays;

public class Solution {
    public int solution(int[] nums) {
        int maxSelectable = nums.length / 2;
        long uniqueCount = Arrays.stream(nums).distinct().count();

        return (int) Math.min(maxSelectable, uniqueCount);
    }
}
