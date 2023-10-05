class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String item : order) {
            if (item.equals("anything") || item.contains("americano")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }
        return answer;
    }
}