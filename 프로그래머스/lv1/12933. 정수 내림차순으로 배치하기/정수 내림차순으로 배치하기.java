import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;     
        StringBuilder sb = new StringBuilder();
        long[] Larray = new long[String.valueOf(n).length()];
        for(int i = 0; i < Larray.length; i++) {
            Larray[i] = (n / (long)Math.pow(10, i)) % 10;
        }
        Arrays.sort(Larray);
        
        for(int i = Larray.length - 1; i >= 0; i--) {
            answer = answer * 10 + Larray[i];
        }
        
        return answer;
    }
}