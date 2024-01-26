class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0; 
        int lastStart = 0; 

        for (int point : section) {
            if (lastStart <= point) {
                lastStart = point + m;
                answer++;
            }
        }

        return answer;
    }
}
