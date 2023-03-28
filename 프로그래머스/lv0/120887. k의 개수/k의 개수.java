class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(; i<=j; i++){
            String iStr = Integer.toString(i);
            for(int n=0; n<iStr.length(); n++){
                int a = iStr.charAt(n) - '0';
                if(k==a) { 
                    answer++;
                }
            }
             
        }
        
        return answer;
    }
}