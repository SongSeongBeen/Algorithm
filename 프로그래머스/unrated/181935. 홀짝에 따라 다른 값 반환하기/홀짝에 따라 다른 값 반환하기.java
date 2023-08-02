import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return (n % 2 != 0) ? evenNumSum(n) : oddNumSum(n);
    }
    
    private int evenNumSum(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).sum();
    }

    private int oddNumSum(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).map(i -> i * i).sum();
    }

}