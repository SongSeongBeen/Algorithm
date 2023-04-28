import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chr = new char[s.length()];
        for(int i =0; i<s.length(); i++){
            chr[i] = s.charAt(i);
        }
        answer = s.length() % 2 == 0 ? String.valueOf(chr[s.length() / 2 - 1]) + String.valueOf(chr[s.length() / 2]) : String.valueOf(chr[s.length() / 2]);

        return answer;
    }
}