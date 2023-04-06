class Solution {
    public int solution(int[][] lines) {
       
        int[] overLine = new int [200];
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                overLine[j]++;
            }
        }
        int answer = 0;
        for (int over : overLine) {
            if (over > 1) answer++;
        }
        return answer;
    }
}