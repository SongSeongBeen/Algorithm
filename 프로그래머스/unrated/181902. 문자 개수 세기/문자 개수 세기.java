class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char ch : my_string.toCharArray()) {
            answer[Character.isUpperCase(ch) ? (ch - 'A') : (ch - 'a' + 26)]++;
        }
        return answer;
    }
}
