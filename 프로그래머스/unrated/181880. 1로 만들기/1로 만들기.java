class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            if (num % 2 != 0)  num -= 1;
            
            while (num > 1) {
                num /= 2;
                answer++;
            }
        }
        return answer;
    }
}