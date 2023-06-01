class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] chars = s.toCharArray();
        int index = 0;
        
        for (char c : chars) {
            index = Character.isWhitespace(c) ? 0 : index + 1;
            answer.append(Character.isWhitespace(c) ? c : (index % 2 == 1) ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        
        return answer.toString();
    }
}
