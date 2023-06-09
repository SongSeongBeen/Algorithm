class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        int tLength = t.length();
        
        for (int i = 0; i <= tLength - pLength; i++) {
            String substr = t.substring(i, i + pLength);
            if (substr.compareTo(p) <= 0) answer++;
        }
        
        return answer;
    }
}