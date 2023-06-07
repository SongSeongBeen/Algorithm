class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char chrS : s.toCharArray()) {
            if (chrS != ' ') {
                int shiftedValue = chrS + n;
                if ((chrS <= 'Z' && shiftedValue > 'Z') || (chrS <= 'z' && shiftedValue > 'z')) {
                    shiftedValue -= 26;
                }
                answer.append((char) shiftedValue);
            } else {
                answer.append(' ');
            }
        }
        return answer.toString();
    }
}