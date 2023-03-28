class Solution {
    public int solution(int n) {
        int i = 1, f = 1;
             
        while (f * (i + 1) <= n) {
            i++;     
            f *= i;       
        }
        
        return i;
    }
}