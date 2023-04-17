import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] chr = new char[s.length()];
        for(int i = 0; i<s.length(); i++){
            chr[i] = s.charAt(i);        
        }
        
        answer = Integer.parseInt(String.valueOf(chr));        
   
        return answer;
    }
}