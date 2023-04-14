class Solution {
    public int[] solution(long n) {
        int size = String.valueOf(n).length();
        int[] answer = new int[size];
        
        for(int i=0; n>0; i++){
            answer[i] = (int)(n % 10);
            n/=10;
        }
        
        return answer;
    }
}