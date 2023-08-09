class Solution {
    public int solution(int a, int b, int c) {
        int intPlus = a + b + c;
        int intSqrt = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int intPow = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        
        if(a != b && a != c && b != c) {
            return intPlus;
        }  else if(a == b && a == c && b == c){
            return intPlus * intSqrt * intPow;
        } else {
            return intPlus * intSqrt;
        }
    }
}