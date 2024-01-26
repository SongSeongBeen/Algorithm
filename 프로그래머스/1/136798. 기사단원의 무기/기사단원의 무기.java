class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisorCounts = calculateDivisorCounts(number);
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            answer += (divisorCounts[i] > limit) ? power :  divisorCounts[i];
        }
        return answer;
    }

    private int[] calculateDivisorCounts(int number) {
        int[] divisorCounts = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; i * j <= number; j++) {
                divisorCounts[i * j]++;
            }
        }
        return divisorCounts;
    }
}
