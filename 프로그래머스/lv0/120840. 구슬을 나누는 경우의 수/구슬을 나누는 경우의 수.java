import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger n = calculateFactorial(balls);
        BigInteger m = calculateFactorial(balls - share).multiply(calculateFactorial(share));
        return n.divide(m).intValue();
    }
    
    private BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}