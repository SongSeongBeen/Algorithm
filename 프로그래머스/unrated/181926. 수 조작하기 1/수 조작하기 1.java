class Solution {
    public int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            n = (c == 'w') ? n + 1
              : (c == 's') ? n - 1
              : (c == 'd') ? n + 10
              : (c == 'a') ? n - 10
              : n;
        }
        return n;
    }
}