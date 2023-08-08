class Solution {
    public int solution(int a, int b) {
        int sum = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        return (sum) >= (2*a*b) ?  sum : (2*a*b);
    }
}