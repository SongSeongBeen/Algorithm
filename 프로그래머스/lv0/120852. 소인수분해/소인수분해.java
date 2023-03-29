import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> factors = new TreeSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        int[] answer = new int[factors.size()];
        int index = 0;
        for (int factor : factors) {
            answer[index++] = factor;
        }
        return answer;
    }
}