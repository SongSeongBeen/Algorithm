import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        List<Long> list = new ArrayList<>();
        
        for (int i = 0; i < str.length(); i++) {
            list.add((n / (long)Math.pow(10, i)) % 10);
        }
        Collections.sort(list);
        
        for (int i = list.size() - 1; i >= 0; i--) {
            answer = answer * 10 + list.get(i);
        }
        return answer;
    }
}