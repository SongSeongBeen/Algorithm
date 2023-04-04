class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
        
        if (b == 1 || isFinite(b)) {
            answer = 1;
        } else {
            answer = getRecurringCycle(b) > 0 ? 2 : 1;
        }
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public boolean isFinite(int b) {
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        return b == 1;
    }
    
    public int getRecurringCycle(int b) {
        int[] remainders = new int[b];
        int remainder = 1;
        int i = 0;
        while (remainders[remainder] == 0 && remainder != 0) {
            remainders[remainder] = i;
            remainder = (remainder * 10) % b;
            i++;
        }
        return remainder == 0 ? 0 : i - remainders[remainder];
    }
}
