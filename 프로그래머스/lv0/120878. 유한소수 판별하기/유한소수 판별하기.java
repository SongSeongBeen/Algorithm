class Solution {
    public int solution(int a, int b) {
        for (;b%2<1;) b /= 2;
        for (;b%5<1;) b /= 5;
        return a%b<1 ? 1 : 2;
    }
}