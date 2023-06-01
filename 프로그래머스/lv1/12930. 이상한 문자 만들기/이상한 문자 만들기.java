class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] chars = s.toCharArray();
        int index = 0;
        
        for (char c : chars) {
            if (Character.isWhitespace(c)) {
                answer.append(c);
                index = 0;
            } else {
                char convertChar = (index % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c);
                answer.append(convertChar);
                index++;
            }
        }
        
        return answer.toString();
    }
}
