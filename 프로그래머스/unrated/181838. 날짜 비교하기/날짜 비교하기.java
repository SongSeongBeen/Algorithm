import java.util.Arrays;

class Solution {
    public int solution(int[] date1, int[] date2) {

        int d1 = Integer.parseInt(Arrays.toString(date1).replaceAll("[\\[\\], ]", ""));
        int d2 = Integer.parseInt(Arrays.toString(date2).replaceAll("[\\[\\], ]", ""));
      
        return d1 >= d2 ? 0 : 1;
    }
}