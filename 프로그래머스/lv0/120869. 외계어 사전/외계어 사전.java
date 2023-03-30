import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String str : dic) {
            if (str.length() == spell.length) { 
                boolean isMatch = true;
                for (int i = 0; i < spell.length; i++) {
                    if (spell[i].charAt(0) != str.charAt(i)) {
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch) {
                    return 1;
                }
            }
        }
        return 2;
    }
}