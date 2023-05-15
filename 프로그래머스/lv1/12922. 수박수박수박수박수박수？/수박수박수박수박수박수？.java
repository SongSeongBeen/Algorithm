class Solution {
    public String solution(int n) {
        String answer = "";
        boolean f = true;
        while(n-->0){
            answer += f ? "수" : "박";
            f = !f;
        } 
        return answer;
    }
}