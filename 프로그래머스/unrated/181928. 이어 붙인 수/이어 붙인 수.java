class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenSum = "";
        String oddSum = "";
        for(int n : num_list){
            if(n%2==0){
                evenSum += Integer.toString(n);
            } else {
                oddSum += Integer.toString(n);
            }
        }
        answer = Integer.parseInt(evenSum) + Integer.parseInt(oddSum);
        return answer;
    }
}