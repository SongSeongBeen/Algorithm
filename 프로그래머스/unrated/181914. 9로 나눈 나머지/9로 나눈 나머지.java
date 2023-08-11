import java.math.BigInteger;

class Solution {
    public int solution(String number) {

        BigInteger bigNumber = new BigInteger(number);
        BigInteger remainder = bigNumber.mod(BigInteger.valueOf(9));
 
        return remainder.intValue();
    }
}