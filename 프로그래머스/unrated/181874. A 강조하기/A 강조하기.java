class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(char s : myString.toCharArray()){
             sb.append((s == 'a' || s == 'A') ? 'A' : Character.toLowerCase(s));
        }
        return sb.toString();
    }
}