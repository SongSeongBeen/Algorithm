class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int divisorCount = divisorCnt(i);
            answer += (divisorCount <= limit) ? divisorCount : power;
        }

        return answer;
    }
    
    private static int divisorCnt(int number) {
        int count = 0;
        int sqrtN = (int)Math.sqrt(number);
        for (int i = 1; i <= sqrtN; i++) {
            if (number % i == 0) {
                count += (number / i == i) ? 1 : 2; 
            }
        }
        return count;
    }
}
