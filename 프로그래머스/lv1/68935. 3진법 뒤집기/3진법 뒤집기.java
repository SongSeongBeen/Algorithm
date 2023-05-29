class Solution {
    public int solution(int n) {
        StringBuilder reversed = new StringBuilder(Integer.toString(n, 3)).reverse();
        return Integer.parseInt(reversed.toString(), 3);
    }
}