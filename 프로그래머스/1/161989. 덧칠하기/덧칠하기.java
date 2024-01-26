class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1; 
        int lastStart = section[0]; 

        for (int point : section) {
            if (lastStart + m <= point) {
                lastStart = point;
                answer++;
            }
        }

        return answer;
    }
}
