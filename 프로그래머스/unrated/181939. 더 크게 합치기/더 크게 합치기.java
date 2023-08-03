class Solution {
    public int solution(int a, int b) {
        String strNum1 = String.valueOf(a) + String.valueOf(b);
        String strNum2 = String.valueOf(b) + String.valueOf(a);
        return (strNum1.compareTo(strNum2) >= 0) ? Integer.parseInt(strNum1) : Integer.parseInt(strNum2);
    }
}