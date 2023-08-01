class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        for(char s : my_string.toCharArray()){
             answer.append(s == alp.charAt(0) ? Character.toUpperCase(s) : s);
        }
        return answer.toString();
    }
}