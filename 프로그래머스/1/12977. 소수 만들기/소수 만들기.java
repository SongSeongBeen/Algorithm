class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int pIntSum = nums[i] + nums[j] + nums[k];
                    if (isPrime(pIntSum)) {
                        answer++;
                    }
                }
            }
        } 
        return answer;
    }
    
    private boolean isPrime(int pIntSum) {
        if (pIntSum <= 1) return false;
        for (int i = 2; i <= Math.sqrt(pIntSum); i++) {
            if (pIntSum % i == 0) return false;
        }
        return true;
    }
}