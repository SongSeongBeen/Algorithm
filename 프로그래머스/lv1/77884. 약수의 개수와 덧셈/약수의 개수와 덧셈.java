class Solution {
    public int solution(int left, int right) {
        int answer = 0;
      
        for (int i = left; i <= right; i++) {
            int divisorCount = countDivisors(i);
            answer += (divisorCount % 2 == 0) ? i : -i;
        }
        
        return answer;
    }
    
    private int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        return count;
    }
}